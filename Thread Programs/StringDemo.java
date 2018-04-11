package com.example.string; 
public class StringDemo
{
	public void stringMethods()
	{
		String example = new String("Welcome");
		System.out.println("Length of String : "+example.length());
		System.out.println("Char at 3rd Index : "+example.charAt(3));
		System.out.println("String start with W: "+example.startsWith("W"));
		System.out.println("Index of M : "+example.indexOf("m"));
		//System.out.println("Substring of String : "+example.subString(0));
		System.out.println("Append String : "+example.concat(" Students"));
		System.out.println("Replace String : "+example.replace("W","H"));
		System.out.println("String in Upper: "+example.toUpperCase());
	}
	public static void main(String args[])
	{
		StringDemo sd = new StringDemo();
		sd.stringMethods();
	}
}