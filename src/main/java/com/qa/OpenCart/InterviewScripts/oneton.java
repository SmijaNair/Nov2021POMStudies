package com.qa.OpenCart.InterviewScripts;

public class oneton {

   public static void printoneToTen(int i){
       System.out.println(i);
       i++;

       if(i<=10){
           printoneToTen(i);
           //System.out.println("1 to 10 is printed");
       }
   }

    public static void main(String[] args) {
        printoneToTen(1);
    }
}
