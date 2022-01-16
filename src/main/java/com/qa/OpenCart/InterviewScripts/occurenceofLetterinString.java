package com.qa.OpenCart.InterviewScripts;

import java.util.HashMap;

public class occurenceofLetterinString {
    public static void occurence(String str){
        String s1 = str.toLowerCase();
        char[]ch = s1.toCharArray();
        for(int i=0;i<ch.length;i++){
            int count =1;
            if(ch[i]==ch[i+1]){
                count++;
                ch[i]='0';
            }

            if(count>1 && ch[i]!='0'){
                System.out.println("Repeated char is "+ch[i]+" repeated "+count +" times");
            }
        }
    }

    public static void main(String[] args) {
        occurence("Hello");
    }
}
