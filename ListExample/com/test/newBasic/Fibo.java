package com.test.newBasic;

public class Fibo {
    public static void fibo(){
        int a = 0;
        int b=1;
        int num = 6;
        for (int i =0; i<=num; i++){
            System.out.print(" " +a);
            a=a+b;
            b=a-b;
        }

    }
    public static void linearSer(){
        int[] arr ={1,56,45,2,7,4};
        int key = 450;
        boolean flag = false;
        for (int i =0; i< arr.length;i++){
            if (arr[i]==key){
                System.out.println("found at index  = " + i);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("not found at any index");
        }
    }
    public static int BinaryS(int[] arr,int key){
            int low = 0;
            int hi = arr.length-1;
            while (low <= hi){
                int mid = (low+hi)/2;
                if (key <arr[mid]){
                    hi= mid-1;
                } else if (key > arr[mid]) {
                    low= mid+1;
                }else {
                    return mid;
                }
            }
            return -1;
    }

    public static void palidnrome(){
        int n = 123;
        int orgValue = n;
        int rev =0;
        while (n!=0){
            rev= rev* 10+n %10;
            n= n/10;
        }
        System.out.println(rev);
        if (orgValue==rev){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrpme");
        }
    }
    public static void main(String[] args) {
        palidnrome();
        fibo();
        linearSer();
        int[] arr = {1,2,3,4,5,6,7,8};
        int key = 4;
        int result = BinaryS(arr, key);
        if (result==-1){
            System.out.println("not present");
        }else {
            System.out.println("element found at index "+result);
        }
    }
}
