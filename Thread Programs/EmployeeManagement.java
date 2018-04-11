package com.example.inherit;

class Employee
{
	int empId;
	String name;
	float salary;
	
	Employee(int empId, String name, float salary)
	{
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	int getId(){ return empId;}
	String getName(){ return name;}
	float getSalary(){ return salary;}
}
class FullTime extends Employee
{
	int workingDays;
	FullTime(int eid, String name, float sal, int workingDays)
	{
		super(eid,name,sal);
		this.workingDays = workingDays;	
	}
	void printData()
	{
		System.out.println("Employee ID: "+getId());
		System.out.println("Employee Name: "+getName());
		System.out.println("Employee Salary: "+getSalary());
		System.out.println("Working Days: "+workingDays);
	}
}
class PartTime extends Employee
{
	int workingHours;
	PartTime(int eid, String name, float sal, int workingHours)
	{
		super(eid,name,sal);
		this.workingHours = workingHours;	
	}
	void printData()
	{
		System.out.println("Employee ID: "+getId());
		System.out.println("Employee Name: "+getName());
		System.out.println("Employee Salary: "+getSalary());
		System.out.println("Working Hours: "+workingHours);
	}
}

public class EmployeeManagement
{
	public static void main(String  args[])
	{
		FullTime ft = new FullTime(111,"Peter",45000,5);
		PartTime pt = new PartTime(222,"John",20000,2);
		
		ft.printData();
		pt.printData();
	}
}




