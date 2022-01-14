package com.qa.OpenCart.InterviewScripts;

public class RepeatedWordsinPara {
    public static void main(String[] args) {
        String str1 = "I love Bangalore so much. And Bangalore is much fun to be ";
        String str = str1.toLowerCase();
        String [] s = str.split(" ");
        for(int i=0;i<s.length;i++){
            int count=1;
            for(int j=i+1;j<s.length;j++){
                if(s[i].equals(s[j])){
                    count=count+1;
                    s[j]="0";
                }
            }
            if(count>1 && s[i]!="0"){
                System.out.println(s[i] +" is repeated "+ count+" times");
            }
        }
    }
}
