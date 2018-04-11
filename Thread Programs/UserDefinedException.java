package com.example.exception;

import java.util.Scanner;
class AgeException extends RuntimeException
{
	public AgeException(String msg)
	{
		super(msg);
	}
}

public class UserDefinedException
{
	public static void main(String ar[])
	{
		int age;
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter your age");
		age = scan.nextInt();
		try
		{
			if(age<=0)
				throw new AgeException("Invalid age exception");
			else
				System.out.println("Valid Age");
		}
		catch(AgeException ae)
		{
			System.out.println("Exception caught: "+ae);
		}
	}
}