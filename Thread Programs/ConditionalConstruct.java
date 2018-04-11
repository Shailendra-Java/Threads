package com.example.conditional;

import com.example.operators.EmployeeSalary;

public class ConditionalConstruct
{
	static double sal;
	public static void main(String args[])
	{
		EmployeeSalary eSal = new EmployeeSalary();
		eSal.getSalary();
		eSal.calculateSalary();
		
		sal = eSal.showSalary();
		
		if(sal > 50000)
			System.out.println("Good Salary Package");
		else if(sal > 30000 && sal < 50000)
			System.out.println("Average Salary Package");
		else
			System.out.println("Poor Salary Package");
	}
}