package com.qa.OpenCart.InterviewScripts;

public class swapwithoutTemp {
    public static void swap(int a ,int b){
        System.out.println("value of a before swap is "+a);
        System.out.println("value of b before swap is "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("value of a after swap is "+a);
        System.out.println("value of b after swap is "+b);
    }

    public static void main(String[] args) {
        swap(30,20);
    }
}
