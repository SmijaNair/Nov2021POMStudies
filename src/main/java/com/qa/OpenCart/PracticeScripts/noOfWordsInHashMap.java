package com.qa.OpenCart.PracticeScripts;

import java.util.HashMap;

public class noOfWordsInHashMap {

    public static void findDup(String str){
        String[] str1 = str.split(" ");

        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        for(int i=0;i<str1.length;i++){
            if(hm.containsKey(str1[i])){
                int count = hm.get(str1[i]);
                hm.put(str1[i],count+1);
            }
            else
            {
                hm.put(str1[i],1);
            }
        }
        System.out.println(hm);
    }

    public static void main(String[] args) {
        findDup("Hello this is Smija is ");

    }
}
