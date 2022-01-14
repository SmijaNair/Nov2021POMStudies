package com.qa.OpenCart.InterviewScripts;

import java.util.HashMap;

public class noOfWordsinHashMap {
    public static void main(String[] args) {
     String str = "helo this is Smija and helo Smija";
     String[]str1=str.split(" ");
     HashMap<String,Integer>hm = new HashMap<>();
     for(int i=0;i<str1.length;i++){
         if(hm.containsKey(str1[i])){
             int count = hm.get(str1[i]);
             hm.put(str1[i],count+1);
         }
         else
             hm.put(str1[i],1);
     }
     System.out.println(hm);
    }
}
