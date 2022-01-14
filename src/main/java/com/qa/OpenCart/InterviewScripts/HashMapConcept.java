package com.qa.OpenCart.InterviewScripts;

import java.util.HashMap;

public class HashMapConcept {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("vishal",10);
        map.put("sachin",20);
        map.put("vaibhav",30);
        map.put("vihan",30);

        System.out.println("Size of map is "+map.size());
        System.out.println(map);
        if(map.containsKey("sachin")){
            System.out.println(map.get("sachin"));
        }
    }
}
