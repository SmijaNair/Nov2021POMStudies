package com.qa.OpenCart.PracticeScripts;

import java.util.ArrayList;

public class ConvertlisttoArray {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("helo");
        al.add("hi");
        al.add("namaste");

        String[] s1 = new String[al.size()];
        for(int i=0;i<s1.length;i++)
        {
            s1[i]=al.get(i);
            System.out.println(s1[i]);
        }
    }
}
