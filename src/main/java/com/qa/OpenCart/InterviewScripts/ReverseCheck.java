package com.qa.OpenCart.InterviewScripts;

import java.util.Locale;

public class ReverseCheck {
    public static void main(String[] args) {
        String str = "Liril";
        String str1=str.toLowerCase();
        String rev="";
        for(int i=str1.length()-1;i>=0;i--){
            rev=rev+str1.charAt(i);
        }
        System.out.println(rev);
        if(str1.equals(rev)){
            System.out.println("The strings "+ str1 + " "+rev+" are same after reverse ");
        }
    }
}
