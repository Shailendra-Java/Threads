package com.example.collection;

import java.util.TreeMap;

public class TreeMapDemo
{
    public static void main(String[] args)
    {        
        TreeMap<String, Integer> obj = new TreeMap<>();
        Integer iobj1 = new Integer(123);
        Integer iobj2 = new Integer(202);
        Integer iobj3 = new Integer(33);
        Integer iobj4 = new Integer(2);
        
        System.out.println("Size of TreeMap is: " + obj.size());
         
        obj.put("L1", iobj1);
        obj.put("L2", iobj2);
        obj.put("L3", iobj3);
        obj.put("L4", iobj4);
        obj.put("L5", null);
		obj.put("L6", null);
                
        System.out.println("\nTreeMap after adding the objects: " + obj);
        System.out.println("Size of TreeMap after adding objects: " + obj.size());
        
        obj.remove("L3");
        obj.remove("L5");
        
        System.out.println("\nTreeMap after removing the objects: " + obj);
        System.out.println("Size of the TreeMap after removing objects: " + obj.size());
    }
}
