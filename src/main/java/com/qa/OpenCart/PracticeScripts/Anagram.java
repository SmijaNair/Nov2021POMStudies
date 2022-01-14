package com.qa.OpenCart.PracticeScripts;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
    anagramCheck("listen","silent");

    }

    public static void anagramCheck(String s1,String s2){
        char[] ch1 =s1.toLowerCase().toCharArray();
        char[]ch2=s2.toLowerCase().toCharArray();
        if(s1.length()==s2.length()){

            Arrays.sort(ch1);
            Arrays.sort(ch2);
            System.out.println(ch1);
            System.out.println(ch2);


        }
        else
        {
            System.out.println(s1 +" and "+s2 +" are not anagrams");
        }
        if(Arrays.equals(ch1,ch2)){
            System.out.println(s1 +" and "+s2 +" are anagrams");
        }
        else
        {
            System.out.println("jhfiasdjfa");
        }
    }
}
