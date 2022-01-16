package com.qa.OpenCart.PracticeScripts;

public class maxinArray {
    public static int maxCheck(int[] a){
        int max = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<max){
                max=a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[]arr={21,12,11,15,19,01,22,0,12,90};
        System.out.println(maxCheck(arr));
    }
}
