package com.java.Basicss;

public class CountNumberOFDigitt {
    public static void main(String[] args) {
//        int num =123456789;
//        int count =0;
//        while (num!=0){
//            num=num/10;
//            count++;
//        }
//        System.out.println("count the total number is " + count);

        //now count even and odd in a number
        int nums=1222556789;
        int evenCount=0;
        int oddCount =0;
        while (nums!=0){
            int rem = nums % 10;
            if(rem % 2==0){
                evenCount++;
            }else {
                oddCount++;
            }
            nums = nums/10;
        }
        System.out.println("count the even number is " + evenCount);
        System.out.println("count the odd number is " + oddCount);



    }
}
