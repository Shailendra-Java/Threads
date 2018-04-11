package com.example.polymoriphism;

class Parent
{
	public void print()
	{
		System.out.println("Method of super class");
	}
}
public class DynamicPolymoriphism extends Parent
{
	public void print()
	{
		System.out.println("Child classs method");
		System.out.println("Dynamic polymoriphism example");
	}

	public static void main(String args[])
	{
		Parent dp = new DynamicPolymoriphism();
		dp.print();
	}
	
}