package com.qa.OpenCart.Collection;

import java.util.HashMap;
import java.util.Map;

public class credentialsmap {
    public static void getCredentialsMap(String role1){
        Map<String,String> credMap = new HashMap<String,String>();
        credMap.put("admin","admin@gmail.com");
        credMap.put("seller","seller@gmail.com");
        credMap.put("vendor","vendor@gmail.com");
        credMap.put("cust","cust@gmail.com");

        if(credMap.containsKey(role1)){
            System.out.println(credMap.get(role1));
        }

    }
    public static void main(String[] args) {
        getCredentialsMap("cust");
    }
}
