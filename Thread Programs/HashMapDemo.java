package com.example.collection;

import java.util.HashMap;

public class HashMapDemo
{
    public static void main(String[] args)
    {        
        HashMap<String, Integer> obj = new HashMap<>();
        Integer iobj1 = new Integer(11);
        Integer iobj2 = new Integer(22);
        Integer iobj3 = new Integer(33);
        Integer iobj4 = new Integer(44);
        
        System.out.println("Size of HashMap is: " + obj.size());
         
        obj.put("L1", iobj1);
        obj.put("L2", iobj2);
        obj.put("L3", iobj3);
        obj.put("L4", iobj4);
        obj.put("L5", iobj1);
                
        System.out.println("\nHashMap after adding the objects: " + obj);
        System.out.println("Size of HashMap after adding objects: " + obj.size());
        
        obj.remove("L3");
        obj.remove("L5");
        
        System.out.println("\nHashMap after removing the objects: " + obj);
        System.out.println("Size of the HashMap after removing objects: " + obj.size());
    }
}
