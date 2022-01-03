package com.qa.OpenCart.InterviewScripts;

public class RepeatedWordsinPara {
    public static void main(String[] args) {
        String str1 ="Helo Bengaluru namaste helo hi and Bengaluru";
        String str = str1.toLowerCase();
        String [] strArray = str.split(" ");
        for(int i=0;i<strArray.length;i++){
            int count=1;
            for(int j=i+1;j<strArray.length;j++){
                if(strArray[i].equals(strArray[j]) && strArray[i]!="")
                {
                    count=count+1;
                    strArray[j]="0";
                }
            }
            if(count>1 && strArray[i]!="0"){
                System.out.println("Repeated string is "+strArray[i]+" and its repeated "+count+" times");
            }
        }
    }
}
