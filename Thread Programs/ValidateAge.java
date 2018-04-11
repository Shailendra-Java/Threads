package com.example.exception;

import java.util.Scanner;

public class ValidateAge
{
	public static void main(String at[])
	{
		int age;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
		age = scan.nextInt();
		assert (age<0 && age>120);
		System.out.println("Age is : "+age);
	}
}