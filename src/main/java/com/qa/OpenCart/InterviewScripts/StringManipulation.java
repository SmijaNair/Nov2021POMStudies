package com.qa.OpenCart.InterviewScripts;

public class StringManipulation {

    public static void main(String[] args) {
        String str = "Smijai";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        try {
            System.out.println(str.charAt(40));
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("exception occureed");
        }
        System.out.println(str.indexOf("i",3));
        System.out.println(str.indexOf("Smijai"));


        String str1 = "  hello   world   ";
        System.out.println(str1);
        System.out.println(str1.trim());
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
