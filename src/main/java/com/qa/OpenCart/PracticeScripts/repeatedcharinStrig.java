package com.qa.OpenCart.PracticeScripts;

import org.apache.poi.util.SystemOutLogger;

public class repeatedcharinStrig {
    public static void rep(String str){
        String str1 = str.toLowerCase();
        char[]ch = str1.toCharArray();
        for(int i=0;i<ch.length;i++){
            int count =1;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count = count+1;
                    ch[j]='0';
                }
            }
            if(count>1 && ch[i]!='0'){
                System.out.println("repeated char is "+ch[i]+" and repeated "+count+" times");
            }
        }

    }

    public static void main(String[] args) {
        rep("HelloNamaste");
    }
}
