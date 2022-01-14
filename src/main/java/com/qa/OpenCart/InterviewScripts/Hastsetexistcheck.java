package com.qa.OpenCart.InterviewScripts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Hastsetexistcheck {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Chrome");
        hs.add("Firefox");
        hs.add("Safari");
        hs.add("InternetExplorer");
        if(hs.contains("InternetExplorer")){
            System.out.println("exists");
        }else{
            System.out.println("no");
        }
    }
//Initialise HashMap and ArrayList in java
   // HashMap<String,String> hm = new HashMap<String,String>();
   // ArrayList<String> al = new ArrayList<String>();
    //HashSet<String>hs = new HashSet<String>();
}
