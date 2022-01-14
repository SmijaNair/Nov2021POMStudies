package com.qa.OpenCart.InterviewScripts;

import java.lang.reflect.Array;

public class maxinArray {
    public static void main(String[] args) {
        int[] arr={2,5,10,15,9,3,25};
        maxCheck(arr);
    }
    public static void maxCheck(int arr[]){
        int max = arr[0];
        for(int i=0;i<arr.length;i++) {
            if (arr[i]>max) {
                max = arr[i];
            }

        }
        System.out.println("maximum is "+max);
      //  System.out.println("second maximum is "+ secondmax);
    }
}
