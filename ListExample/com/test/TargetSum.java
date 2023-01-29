package com.test;

public class TargetSum {
    //sum target we have adding two number and then find the target sum two values.
    public int sumTarget(int[] arr, int target){
        int ans =0;
        for (int i =0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    ans++;
                }
            }

        }
        return ans;
    }

    //now question 2 is :
    //count the number of triplets whose sum is equal to the given x;
    public int tripletTargetSum(int[] arr, int target){
        int ans=0;
        int n = arr.length;
        for (int i =0; i < n; i++){
            for (int j = i+1; j < n;j++){
                for (int k =j+1; k < n; k++){
                    if (arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        int[] arrays ={1,2,3,4,5,4,6,8,7,16,12,24,32,85,10};
        TargetSum targetSum = new TargetSum();
        int i = targetSum.sumTarget(arrays,8);
        System.out.println("i = " + i);

        int[] ar={1,4,5,6,3};//target 12

        int i1 = targetSum.tripletTargetSum(ar, 12);
        System.out.println("i1 = " + i1);
    }
}
