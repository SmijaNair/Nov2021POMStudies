package com.qa.OpenCart.InterviewScripts;

public class RepeatedcharinString {
    public static void main(String[] args) {
        String str1 = "HelloNamaste";
        String str=str1.toLowerCase();
        char [] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            int count=1;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    //System.out.println("equals");
                    count=count+1;
                    ch[j]='0';
                }
            }
            if(count>1 && ch[i]!='0'){
                System.out.println("Repeated character is "+ch[i]+" and its repeated "+ count+" times");
            }
        }
    }
}
