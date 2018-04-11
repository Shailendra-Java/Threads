package com.example.bitwise;

public class BitwiseOperator
{
	public static void main(String ar[])
	{
		int x = 10;
		int y = 8, result;
		
		result = x&y;
		System.out.println("Bitwise AND : "+result);

		result = x|y;
		System.out.println("Bitwise OR : "+result);
		
		result = ~x;
		System.out.println("Bitwise NOT : "+result);

		result = x^y;
		System.out.println("Bitwise XOR : "+result);
	}
}