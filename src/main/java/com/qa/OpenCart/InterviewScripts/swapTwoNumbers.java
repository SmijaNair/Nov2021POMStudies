package com.qa.OpenCart.InterviewScripts;

public class swapTwoNumbers {
    public static void main(String[] args) {
        swapNumbers(10,5);
    }
    public static void swapNumbers(int x,int y){
        System.out.println("numbers before swapping are "+ x +" and "+ y);
//        int temp=x;
//        x=y;
//        y=temp;
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("numbers after swapping are "+ x +" and "+ y);

    }
}
