package com.example.instance_of;
class Employee
{
	int eid;
	String name;
	float salary;
	
	public Employee(int id, String nam, float sal)
	{
		eid = id;
		name = nam;
		salary = sal;
	}
	public String getDetails()
	{
		return "Emp ID : "+eid+"\nName : "+name+"\nSalary : "+salary;
	}
}
class Manager extends Employee
{
	int mgrId;
	public Manager(int id, String name, float sal, int mid)
	{
		super(id,name,sal);
		mgrId = mid;
	}
	public void showInfo()
	{
		System.out.println("Manager Details");
		System.out.println(getDetails());
		System.out.println("Manager ID : "+mgrId);

	}
}
class Director extends Employee
{
	int dId;
	public Director(int id, String name, float sal, int dirid)
	{
		super(id,name,sal);
		dId = dirid;
	}
	public void showInfo()
	{
		System.out.println("Director Details");
		System.out.println(getDetails());
		System.out.println("Director ID : "+dId);

	}
}
class Supervisor extends Employee
{
	int spid;
	public Supervisor(int id, String name, float sal, int sid)
	{
		super(id,name,sal);
		spid = sid;
	}
	public void showInfo()
	{
		System.out.println("Supervisor Details");
		System.out.println(getDetails());
		System.out.println("Supervisor ID : "+spid);

	}
}
public class InstanceOfDemo
{
	public void show(Employee emp)
	{
		if(emp instanceof Manager)
		{
			// Type casting Downcasting
	
			Manager m = (Manager)emp;
			m.showInfo();
		}
		else if(emp instanceof Director)
		{
			Director d = (Director)emp;
			d.showInfo();	
		}
		else if(emp instanceof Supervisor)
		{
			Supervisor sp = (Supervisor)emp;
			sp.showInfo();
		}
	}
	public static void main(String args[])
	{
		InstanceOfDemo iod = new InstanceOfDemo();

		Manager mgr = new Manager(111,"Peter",45000,452);
		Director dir = new Director(223,"John",85000,222);
		Supervisor sp = new Supervisor(333,"Latham",25000,123);

		iod.show(mgr);
	}
}

