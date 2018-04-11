package com.example.thread;

class NewThreadClass implements Runnable
{
	Thread t;
	NewThreadClass() 
	{
		t = new Thread(this,"ChildThread" );
		System.out.println("Thread created: " + t);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{ 
				System.out.println(t + "loop :" + i);
				Thread.sleep(100);
			}
		}
		catch( InterruptedException obj)
		{
			System.out.println("Thread :" + t + "interrupted");
		}
	}
}
class IsAliveDemo 
{
	public static void main(String args[])
  	{
      		NewThreadClass obj = new NewThreadClass();
	  	System.out.println(obj.t  + "is alive ? : " + obj.t.isAlive());
		try
		{
     			for(int i=1;i<=5;i++)
     			{
				System.out.println("Main Thread loop:" + i);
				Thread.sleep(200);
      			}
		}
		catch(InterruptedException e)
     		{
			System.out.println("Main thread is interrupted");
		}
		System.out.println(obj.t  + "is alive ? : " +	obj.t.isAlive());
		System.out.println("Main Thread is exiting");
	}
}
