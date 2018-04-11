package com.example.thread;

class SynchronizedMethods
{
	int d;
	boolean flag = false;
	synchronized int getData()
	{
		if(!flag)
		{
			try
			{
				wait();
			}

			catch(InterruptedException e)
			{
				System.out.println(" Exception caught");
			}
		}
		System.out.println("Got data:" + d);
		flag=false;
		notify();
		return d;
	}
	synchronized void putData(int d)
	{

		if(flag)
		{

			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(" Exception caught");
			}
		}
		this.d = d;
		flag=true;
		System.out.println("Put data with value:" + d);
		notify();

	}
}

class Producer implements Runnable
{
	SynchronizedMethods t;
	public Producer(SynchronizedMethods t)
	{
		this.t = t;
		new Thread(this,"Producer").start();
		System.out.println("Put Called by producer");
	}
	public void run()
	{

		int data =0;
		for(int i=0; i<5; i++)
		{
			data=data+1;
			t.putData(data);
		}
	}
}
class Consumer implements Runnable
{
	SynchronizedMethods t;
	public Consumer(SynchronizedMethods t)
	{
		this.t = t;
		new Thread(this,"Consumer").start();

		System.out.println("Get Called by consumer");
	}
	public void run()
	{

		for(int i=0; i<5; i++)
		{
			t.getData();
		}
	}
}
public class InterThreadComm
{
	public static void main(String args[])
	{
		SynchronizedMethods obj1 = new SynchronizedMethods();
		Producer p = new Producer(obj1);
		Consumer c = new Consumer(obj1);

	}
}



