package com.qa.OpenCart.PracticeScripts;

import java.util.Arrays;

public class Anagram
{
    public static void anagramCheck(String str1,String str2){
        String st1 = str1.toLowerCase();
        char [] ch1 = str1.toCharArray();
        String st2 = str2.toLowerCase();
        char [] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(ch1);
        System.out.println(ch2);
        if(ch1.length==ch2.length){
            if(Arrays.equals(ch1,ch2))
            {
                System.out.println("Anagram");
            }
            else
            {
                System.out.println("Not anagram");
            }

        }
        else
        {
            System.out.println("Not anagram");
        }
    }

    public static void main(String[] args) {
         anagramCheck("mia","aim");
    }
}