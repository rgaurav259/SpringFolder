package com.java.exceptionHandling;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ExceptionExample {

    public static void main(String[] args) {

        List<String> stringList= Arrays.asList("22","33","44","xyz","#","%$&&%%^^^",null,"null","");
//
//        for (String s : stringList) {
//            System.out.println(Integer.parseInt(s));
//        }
        //stringList.forEach(x->System.out.println(Integer.parseInt(x)));

        //uisng map
//        List<Integer> collect = stringList.stream().map(Integer::parseInt).collect(Collectors.toList());
//        System.out.println("collect = " + collect);

        //now catch exception
//        stringList.forEach(s -> {
//            try {
//                System.out.println(Integer.parseInt(s));
//            }catch (NumberFormatException e){
//                System.out.println(e.getMessage());
//            }
//            catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//        });


        //--------------------------



        //now eception method create

        stringList.forEach(ExceptionExample::printList);
        //stringList.forEach(st->printList(st));

        //using consumer call
        stringList.forEach(handleExceptionIfAny(s -> System.out.println(Integer.parseInt(s))));

    }



    public static void printList(String st){
        try {
            System.out.println(Integer.parseInt(st));
        }catch (NumberFormatException e){
            System.out.println("Exception is : " + e.getMessage());
        }
        catch (Exception e){
            //System.out.println(e.getMessage());
        }

    }

    //using consumer
   public static Consumer<String> handleExceptionIfAny(Consumer<String> str){
        return obj->{
            try {
                str.accept(obj);
            }catch (Exception ex){
                System.out.println("exception is "+ex.getMessage());
            }

        };
    }





}
