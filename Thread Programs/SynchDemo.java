package com.example.thread;

class Example
{
	 public void print()
	{
		  for(int i = 0; i < 10; i++)
		  {
			  System.out.println("No : "+i);
		  }
	}
}
class PrintNo extends Thread 
{
	Example ex;
	PrintNo(Example ex, String name)
	{
		super(name);
		this.ex = ex;
	}
	  public void run()
	  { 
		try 
		{
			synchronized(ex)
			{
				System.out.println(""+Thread.currentThread());
				ex.print();
				Thread.sleep(1000);
			}
		}
		catch( InterruptedException obj)
		{
			System.out.println("Thread : interrupted");
		}
	
	}
}
class PrintNo2 extends Thread 
{
	Example ex;
	PrintNo2(Example ex, String name)
	{
		super(name);
		this.ex = ex;
	}
	  public void run()
	  { 
		try 
		{
			synchronized(ex)
			{
				System.out.println(""+Thread.currentThread());
				ex.print();
				Thread.sleep(1000);
			}
		}
		catch( InterruptedException obj)
		{
			System.out.println("Thread : interrupted");
		}
	
	}
}
public class SynchDemo
{
  	 public static void main(String args[])
    	{
	     	Example e1 = new Example();
		 
		 PrintNo pn1 = new PrintNo(e1,"Thread-1");
		 PrintNo2 pn2 = new PrintNo2(e1,"Thread-2");
		 pn1.start();
		 pn2.start();
	} 
}
