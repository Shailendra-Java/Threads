package com.example.thread;

class ChildThread implements Runnable
{
    Thread t;
    ChildThread(int p) 
    {
      t = new Thread(this,"ChildThread" );
      t.setPriority(p);
      System.out.println("Thread created: " + t);
    }

  public void run()
  {
 	try
    	{
    		for(int i=1;i<=5;i++) 
		{
    			System.out.println(t + "loop :" + i);
	   		Thread.sleep(500);
      		}
   	 }
    	catch( InterruptedException obj)
    	{
		System.out.println("Thread :" + t + "interrupted");}
    	}
}
class PriorityDemo 
{
  public static void main(String args[])
   {
	ChildThread obj1 = new ChildThread(Thread.NORM_PRIORITY - 2);
	ChildThread obj2 = new ChildThread(Thread.NORM_PRIORITY + 2);
    	ChildThread obj3 = new ChildThread(Thread.NORM_PRIORITY + 3);

	//Starting the threads with different priority
	obj1.t.start();
    	obj2.t.start();
    	obj3.t.start();
    	try
	{
		System.out.println("Main thread waiting for child thread to finish");
		obj1.t.join();
		obj2.t.join();	
		obj3.t.join();	
	}
	
	catch(InterruptedException e)
       	 {
		System.out.println("Main thread is interrupted");}
		System.out.println(obj1.t  + "is alive ? : " +obj1.t.isAlive());
		System.out.println(obj2.t  + "is alive ? : " +obj2.t.isAlive()); 
		System.out.println(obj3.t  + "is alive ? : " +obj3.t.isAlive()); 
		System.out.println("Main Thread is exiting");
 	  }
}
