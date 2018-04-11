package com.example.exception;
import java.util.Scanner;
import java.util.InputMismatchException;

public class UncheckedException
{
	int x,y,z;
	public void getData()  throws Exception
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		x = scan.nextInt();
		y = scan.nextInt();
	}
	public void compute()
	{
		try
		{
			z = x/y;
		}
		catch(ArithmeticException aexp)
		{
			System.out.println("Error: Please enter a positive non-zero value");
		}
		finally
		{
			System.out.println("Always Execute");
		}
		System.out.println("Result = "+z);
	}
	public static void main(String args[])
	{
		UncheckedException uex = new UncheckedException();
		try
		{
			uex.getData();
		}
		catch(Exception exp)
		{
			System.out.println("Error : "+exp);
		}
		uex.compute();
	}
}