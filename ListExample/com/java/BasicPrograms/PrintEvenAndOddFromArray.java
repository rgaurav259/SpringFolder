package com.java.BasicPrograms;

import java.util.ArrayList;
import java.util.List;

public class PrintEvenAndOddFromArray {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,8,7,3,2};

        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                System.out.println("even number = " + arr[i]);
            }
            else {
                System.out.println("odd number = " + arr[i]);
            }
        }

        //-------------------------------------------------------------
        int[] myarr = {1,2,5,4,8,7,3,2};
        String even ="" ;
        String odd ="";
        for(int i = 0; i<myarr.length; i++)
        {
            if(myarr[i]%2==0) {
                even = even  + " "+myarr[i];
            }
            else {
                odd = odd + " "+ myarr[i];
            }
        }
        System.out.println("Even no : "+ even +"\nOdd no : "+odd);


    //------------------------------999999999000000000000000000000000

        int[] a = {2,3,4,5,6,7,8,9,0};
        List<Integer> evens = new ArrayList<Integer>();
        List<Integer> odds = new ArrayList<Integer>();

        try{
            for(int i = 0;i<a.length;i++) {
                if(a[i]%2==0) {
                    evens.add(a[i]);
                }
                else
                    odds.add(a[i]);
            }
        }
        catch (NumberFormatException e){
            System.out.println(e.getCause());
        }
        catch (Exception e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }

        System.out.println("Even nummber in the Array = "+ evens);
        System.out.println("Odd nummber in the Array = "+ odds);
    }
}

