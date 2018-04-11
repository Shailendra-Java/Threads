package com.example.instance_of;

interface Niit
{
	public void show();
}
public class InstanceOfDemo2 implements Niit
{
	public void show()
	{
		System.out.println("Welcome to NIIT ");
	}
	public static void main(String[] args)
	{
		Niit demo = new InstanceOfDemo2();
		demo.show();
		System.out.println("Is demo instance of InstanceOfDemo2 class "+(demo instanceof InstanceOfDemo2 ));		
	}
}

