package com.example.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ComparatorDemo 
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Alex", 88);
        Student s2 = new Student("Tom", 90);
		Student s3 = new Student("Bob", 90);
        Student s4 = new Student("Joe", 78);
        
        ArrayList<Student> obj = new ArrayList<>();
        obj.add(s1);
        obj.add(s2);
		obj.add(s3);
        obj.add(s4);
        
        System.out.println("Student details are:");
        
        ListIterator li = obj.listIterator();
        while(li.hasNext())
        {
            System.out.println(li.next());
        }
        
        Collections.sort(obj, new MarksCompare());
        
        System.out.println("Mark wise sort:");
        
        ListIterator li2 = obj.listIterator();
        while(li2.hasNext())
        {
            System.out.println(li2.next());
        }
        Collections.sort(obj, new NamesCompare());
        
        System.out.println("Name wise sort:");
        
        ListIterator li3 = obj.listIterator();
        while(li3.hasNext())
        {
            System.out.println(li3.next());
        }
    }
}
