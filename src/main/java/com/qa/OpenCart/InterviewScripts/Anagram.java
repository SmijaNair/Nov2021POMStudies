package com.qa.OpenCart.InterviewScripts;

import io.github.bonigarcia.wdm.managers.SeleniumServerStandaloneManager;

import java.util.Arrays;
import java.util.Optional;

public class Anagram {
    public static void checkAnagram(String str1,String str2){
        String s1=str1.replaceAll("\\s","");
        String s2=str2.replaceAll("\\s","");
        char[]ch1=s1.toLowerCase().toCharArray();
        char[]ch2=s2.toLowerCase().toCharArray();
        boolean status=true;
        if(ch1.length!=ch2.length){
            status=false;
        }
        else
        {
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            status = Arrays.equals(ch1,ch2);
        }
        if(status)
        {
            System.out.println(str1+" and "+str2 +" are anagarams");
        }
        else
            System.out.println(str1+" and "+str2 +" are not anagarams");
    }

    public static void main(String[] args) {
        checkAnagram("silent","listen");
    }
}
