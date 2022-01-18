package com.qa.OpenCart.Collection;

import java.util.HashMap;
import java.util.Map;

public class hashmapconcept {
    public static void main(String[] args) {
        Map<String,String> empMap = new HashMap<String,String>();
        empMap.put("name","Tom");
        empMap.put("Age","29");
        empMap.put("City","Bengaluru");
        empMap.put("Country","India");
        empMap.put(null,"ads");
        empMap.put(null,"se");
        empMap.put("phone",null);
        empMap.put("helo",null);
//        System.out.println(empMap.get("name"));
//        System.out.println(empMap.get(null));
//        System.out.println(empMap.get("phone"));
//        System.out.println(empMap.get("helo"));
//        System.out.println(empMap.get("se"));
//        System.out.println(empMap.get("ads"));

//Print only keys
        for(String s : empMap.keySet()){
            System.out.println("keys "+s);
        }
        //Print only values
        for(String v : empMap.values()){
            System.out.println("values "+ v);
        }
        //Print key and value
        for(Map.Entry<String,String> entry : empMap.entrySet()){
            System.out.println("Key "+entry.getKey());
            System.out.println("Values "+entry.getValue());
        }
    }
}
