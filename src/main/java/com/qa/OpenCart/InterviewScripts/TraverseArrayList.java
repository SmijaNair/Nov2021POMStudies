package com.qa.opencart.InterviewScripts;

import java.util.ArrayList;

public class TraverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(2);
        al.add(19);
        al.add(20);
        al.add(12);
        al.add(10);
        al.add(1);
        for(Integer i : al){
            System.out.println(i);
        }
    }
}
