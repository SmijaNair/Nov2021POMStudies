package com.qa.OpenCart.InterviewScripts;

import java.util.ArrayList;

public class ArrayListexistcheck {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Word");
        al.add("Excel");
        al.add("Safari");
        al.add("Chrome");

        if(al.contains("Chrome")){
            System.out.println("Exists");
        }else
        {
            System.out.println("No");
        }
    }
}
