package com.qa.OpenCart.InterviewScripts;

public class ReverseCheck {
    public static void main(String[] args) {
        String str1="Pencil";
        String str = str1.toLowerCase();
        String reverse = "";
        char[] ch = str.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
          reverse=reverse+ch[i];
        }
        System.out.println("Reverse  is "+reverse);
        if(str.equals(reverse)){
            System.out.println("The strings are same after reverse");
        }
    }
}
