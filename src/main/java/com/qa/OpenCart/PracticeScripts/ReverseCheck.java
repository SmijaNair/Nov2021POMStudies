package com.qa.OpenCart.PracticeScripts;

public class ReverseCheck {
    public static void main(String[] args) {
        System.out.println(reverseCheck("Hello"));
    }
    public static String reverseCheck(String s){
        String s1 = s.toLowerCase();
        String rev = "";
        for(int i = s1.length()-1;i>=0;i--){
            rev = rev+s1.charAt(i);
        }
        return rev;
    }
}
