package com.example.operators;

import java.util.Scanner;

public class EmployeeSalary
{
	double salary, finalSalary,hra,pf,specialAnounce;
	public void getSalary()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter basic salary: ");
		salary = scan.nextDouble();
	}
	public void calculateSalary()
	{
		hra = (salary/100)*50;
		specialAnounce = (salary/100)*75;
		pf = (salary/100)*12;
		
		finalSalary = salary+hra+specialAnounce-pf;
	}
	public double showSalary()
	{
		System.out.println("Employee salary description");
		System.out.println("-----------------------------");
		System.out.println("HRA 50% : "+hra);
		System.out.println("Special announce 75% : "+specialAnounce);
		System.out.println("PF deduction 12% : "+pf);
		System.out.println("Basic Salary : "+salary);
		System.out.println("Net salary : "+finalSalary);
		
		return finalSalary;
	}
	public static void main(String args[])
	{
		EmployeeSalary eSalary = new EmployeeSalary();
		eSalary.getSalary();
		eSalary.calculateSalary();
		eSalary.showSalary();
	}
}