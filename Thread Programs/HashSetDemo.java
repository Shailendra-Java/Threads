package com.example.collection;

import java.util.*;

class Contact
{
	private String name;
	private long phone;
	Contact(String name, long phone)
	{
		this.name = name;
		this.phone = phone;
	}
	public String getName()
	{
		return name;
	}
	public long getPhone()
	{
		return phone;
	}
}
public class HashSetDemo
{
	public static void main(String args[])
	{
		Contact ct1 = new Contact("Peter",789789778);
		Contact ct2 = new Contact("John",789757778);
		Contact ct3 = new Contact("Tom",909789778);
		Contact ct4 = new Contact("Ammy",899789778);
		
		HashSet<Contact> hs = new HashSet<>();
		hs.add(ct1);
		hs.add(ct2);
		hs.add(ct3);
		hs.add(ct4);
		
		System.out.println("No. of objects : "+hs.size());
		Iterator iterator = hs.iterator();
		while(iterator.hasNext())
		{
			Contact ct = (Contact)iterator.next();
			System.out.println("Name : "+ct.getName());
			System.out.println("Phone : "+ct.getPhone());
		}		
	}
}