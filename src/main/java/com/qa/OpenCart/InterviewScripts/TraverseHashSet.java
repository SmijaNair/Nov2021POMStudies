package com.qa.OpenCart.InterviewScripts;

import java.util.HashSet;
import java.util.Iterator;

public class TraverseHashSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("apple");
        hs.add("banana");
        hs.add("pear");
        hs.add("cherry");
        hs.add("strawberry");
        Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
