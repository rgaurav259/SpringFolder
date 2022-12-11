package com.java.Arrayyyy;


public class ArrayUtil1 {

    public void printArray(int[] arr){
        int n =arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void arrayDemo(){
        int [] myArray = new int[5];
        myArray[0]=56;
        myArray[1]=86;
        myArray[2]=5776;
        myArray[3]= 5886;
        myArray[4]=456;
        printArray(myArray);
        System.out.println("lenght is: " + myArray.length);
        System.out.println(myArray[myArray.length-1]);
    }

    public static void main(String[] args) {
        ArrayUtil1 arrayUtil1= new ArrayUtil1();
        arrayUtil1.arrayDemo();
    }
}
