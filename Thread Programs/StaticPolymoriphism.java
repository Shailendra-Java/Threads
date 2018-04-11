package com.example.polymoriphism;
public class StaticPolymoriphism
{
	int temp;
	float  temp2;
	public void swap(int x, int y)
	{
		System.out.println("Before Swap X = "+x+"\nY = "+y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("After Swap X = "+x+"\nY = "+y);
	}
	public void swap(float x, float y)
	{
		System.out.println("Before Swap X = "+x+"\nY = "+y);
		temp2 = x;
		x = y;
		y = temp2;
		System.out.println("After Swap X = "+x+"\nY = "+y);
	}
	public void add(int x, int y, int z)
	{
		temp = x+y+z;
		System.out.println("Add of 3 int = "+temp);
	}
	public void add(float x, float y)
	{
		temp2 = x+y;
		System.out.println("Add of 2 float= "+temp);
	}
	public void add(int x, int y)
	{
		temp = x+y;
		System.out.println("Add of 2 int= "+temp);
	}

	public static void main(String args[])
	{
		StaticPolymoriphism sp = new StaticPolymoriphism();
		sp.swap(11.5f,12.4f);
		sp.add(11,22,33);
		sp.swap(100,200);
		sp.add(15.5f,16.5f);
		sp.add(121,212);
	}
	
}