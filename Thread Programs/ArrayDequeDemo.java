package com.example.collection;
//Imporing ArrayDeque
import java.util.ArrayDeque;

public class ArrayDequeDemo 
{
    public static void main(String[] args)
    {
        ArrayDeque<Double> obj = new ArrayDeque<Double>();
        Double dobj1 = new Double(7.5);
        Double dobj2 = new Double(8.5);
        Double dobj3 = new Double(9.5);
        Double dobj4 = new Double(10.5);
        
        System.out.println("Size of ArrayDeque is: " + obj.size());
        
        obj.add(dobj1);
        obj.add(dobj2);
                
        System.out.println("\nArrayDeque after adding the objects: " + obj);
        System.out.println("Size of ArrayDeque after adding objects: " + obj.size());
        
        obj.addFirst(dobj3);
        obj.addLast(dobj4);
        
        System.out.println("\nArrayDeque after adding the objects at first and last: " + obj);
        System.out.println("Size of ArrayDeque after adding objects at first and last: " + obj.size());
        
        obj.removeFirst();
        
        System.out.println("\nArrayDeque after removing the first object: " + obj);
        System.out.println("Size of ArrayDeque after removing the first objects: " + obj.size());
    }
}
