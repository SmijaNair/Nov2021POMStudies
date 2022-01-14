package com.qa.OpenCart.PracticeScripts;

import java.util.Locale;

public class RepeatedcharinString {
    public static void main(String[] args) {
        checkString(" my beautiful name is smija and smija is beautiful ");
    }
    public static void checkString(String s){
        String s1 = s.toLowerCase();
        String [] ch = s1.split(" ");
        for(int i=0;i<ch.length;i++){
            int count =1;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i].equals(ch[j])){
                    count++;
                    ch[j]="0";

                }
            }
            if(count>1 && ch[i]!="0")
            {
                System.out.println(ch[i]+" is repeated "+ count+" times");
            }
        }

    }
}
