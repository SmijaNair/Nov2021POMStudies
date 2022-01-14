package com.qa.OpenCart.PracticeScripts;

public class secondMaxinArray {
    public static void main(String[] args) {
        int []arr = {32,12,11,0,9,2};
        System.out.println(secondMax(arr,6));
    }
    public static int secondMax(int []arr,int len){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[len-2];
    }
}
