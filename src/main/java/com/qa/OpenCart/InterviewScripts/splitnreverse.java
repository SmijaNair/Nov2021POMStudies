package com.qa.OpenCart.InterviewScripts;

public class splitnreverse {
    public static void splitrev(String str){
        String str1 = str.toLowerCase();
        String [] str2 = str1.split("_");
        String str3="";
        for(int i=0;i<str2.length;i++){

            String s1 ="";
            //System.out.println(str2[i]);
            char[]ch1=str2[i].toCharArray();
            for(int j=ch1.length-1;j>=0;j--){

               // System.out.println(ch1[j]);
                 s1 = s1+ch1[j];

            }
            System.out.println("s1 is "+ s1);
            str3=str3+s1+"_";


        }
        System.out.println("str3 is "+str3);
        System.out.println(str3.toUpperCase() );

    }

    public static void main(String[] args) {
        splitrev("JAVA_PYTHON_RUBY_JAVASCRIPT");

    }
}
