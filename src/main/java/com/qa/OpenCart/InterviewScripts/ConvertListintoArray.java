package com.qa.OpenCart.InterviewScripts;

import java.util.ArrayList;

public class ConvertListintoArray {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Rakshitha");
        al.add("Vara");
        al.add("Humera");
        al.add("Pramod");
        al.add("Arun");
        /*ArrayList to Array conversion*/
        String[] str = new String[al.size()];
        for(int i=0;i<al.size();i++){
            str[i]=al.get(i);
        }
        for(String s : str){
            System.out.println(s);
        }
    }
}
