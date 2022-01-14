package com.qa.OpenCart.InterviewScripts;

public class secondmaxinArray {
    public static void main(String[] args) {
        int arr[] = {3,34,1,12,15};
        System.out.println(secondLargest(arr,5));
    }
    public static int secondLargest(int arr[],int length){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    return arr[length-2];
    }
}
