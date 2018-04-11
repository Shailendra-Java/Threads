package com.example.enum_demo;
public enum Mango
{
	Carrie(10), Fairchild(9),Haiden(12);
	int price;
	Mango(int p)
	{
		price = p;
	}

	public int getPrice()
	{
		return price;
	}
}