package com.example.thread;

class SynchronizedMethods
{
    int d;
    synchronized void getData()
    {
	     System.out.println("Got data:" + d);
   	
    }
    synchronized void putData(int d)
    {
	     this.d = d;
   	     System.out.println("Put data:" + d);
   }
}
class Producer extends Thread
{
   SynchronizedMethods t;
   public Producer(SynchronizedMethods t)
   {
	this.t = t;
   }
   public void run()
   {
	int data =700;
	for(int i=0; i<5; i++) 
    	{
	  	System.out.println("Put Called by producer");
	  	t.putData(data++);
    	}  
   }
}
class Consumer extends Thread
{
   SynchronizedMethods t;
   public Consumer(SynchronizedMethods t)
   {
	this.t = t;
   }
   public void run()
   {
      for(int i=0; i<5; i++) 
      {
	System.out.println("Get Called by consumer");
      	t.getData();          
      }
   }
}
public class ProducerConsumer
{
   public static void main(String args[])
   {
	   SynchronizedMethods obj1 = new SynchronizedMethods();
	   Producer p = new Producer(obj1);
	   Consumer c = new Consumer(obj1);
	   p.start();
	   c.start();
   }
}
