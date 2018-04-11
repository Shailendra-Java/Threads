package com.example.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo  
{
    public static void main(String[] args)
    {
        ArrayList<String> obj = new ArrayList<>();
        String sobj1 = new String("Element 1");
        String sobj2 = new String("Element 2");
        String sobj3 = new String("Element 3");
        String sobj4 = new String("Element 4");
        
        System.out.println("Size of ArrayList is: " + obj.size());
        
        obj.add(sobj1);
        obj.add(sobj2);
        obj.add(sobj3);
        obj.add(sobj4);
        obj.add(sobj1);
        
        System.out.println("\nArrayList after adding the objects: " + obj);
        System.out.println("Size of ArrayList after adding objects: " + obj.size());
        
        obj.remove(2);
        obj.remove(sobj4);
        
        System.out.println("\nArrayList after removing the objects: " + obj);
        System.out.println("Size of ArrayList after removing objects: " + obj.size());
        
        System.out.println("\nThe final ArrayList: ");
        ListIterator i = obj.listIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
