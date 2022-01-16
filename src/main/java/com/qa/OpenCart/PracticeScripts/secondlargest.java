package com.qa.OpenCart.PracticeScripts;

public class secondlargest {
    public static int secCheck(int[] a,int lenght){

        for(int i=0;i<lenght;i++){
            int max = a[i];
            int temp=0;
            for (int j=i+1;j<lenght;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a[lenght-2];
    }

    public static void main(String[] args) {
        int[] arr = {12,21,19,03,1,11,31};
        System.out.println(secCheck(arr,7));
    }
}
