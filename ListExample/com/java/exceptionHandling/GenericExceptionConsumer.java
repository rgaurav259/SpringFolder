package com.java.exceptionHandling;

import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class GenericExceptionConsumer {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(2,24,44,0);

        List<Integer> lst = Arrays.asList(10,20);
        lst.forEach(hadleCheckedExceptionConsumer(i->{
            Thread.sleep(i);
            System.out.println(i);
        }));


        List<String> stringList= Arrays.asList("2","24","44","xyz","#@@@",null,"null","");


        stringList.forEach(handleGenericException
                (s -> System.out.println(Integer.parseInt(s)),
                        NumberFormatException.class));

        integerList.forEach(handleGenericException
                (s -> System.out.println(10/s),
                        ArithmeticException.class));

        //handle exception for checkedExcepttion

        List<Integer> integerList1 = Arrays.asList(10,20);
        integerList1.forEach(i-> {
            try {
                Thread.sleep(i);
                System.out.println(i);
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
                e.printStackTrace();
            }
        });
    }



    public static <Target,ExObj extends Exception> Consumer<Target> handleGenericException(Consumer<Target> targetConsumer,

                                                                                           Class<ExObj> exObjClass ){

        return obj->{
            try {
                targetConsumer.accept(obj);
            }catch (Exception ex){
                try {
                    ExObj exObj = exObjClass.cast(ex);
                    System.out.println("exception is " + ex.getMessage());
                }catch (ClassCastException ecx){
                    throw ex;
                }
            }

        };

    }


    static <Target> Consumer<Target> hadleCheckedExceptionConsumer
            (CheckedExceptionHandlerConsumer<Target,Exception>handlerConsumer){




        return obj->{
            try {
                handlerConsumer.accept(obj);
            }catch (Exception ex){
                throw new RuntimeException(ex);
            }

        };

    }

}
