package com.example.inherit;

class Books
{
	int pageNo;
	String author, name;
	float price;

	Books()
	{
		pageNo = 100;
		author = "Chetan Bhagat";
		name = "Two States";
		price = 450.50f;
	}
	 
	void displayInfo()
	{
		System.out.println("Book Name : "+name);
		System.out.println("Author Name : "+author);
		System.out.println("Page No : "+pageNo);
		System.out.println("Book Price : "+price);
	}
}

public class PaperBook extends Books
{
	int shippingCharge;
	PaperBook()
	{
		shippingCharge = 40;
	}
	public void showInfo()
	{
		displayInfo();
		System.out.println("Shipping Charge : "+shippingCharge);
	}
	public static void main(String  args[])
	{
		PaperBook pb = new PaperBook();
		pb.showInfo();
	}
}





