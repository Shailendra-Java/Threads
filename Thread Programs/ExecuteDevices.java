package com.example.inherit;

abstract class ElectronicDevices
{
	abstract void on();
	abstract void off();
	abstract void voltage();
}

class Television extends ElectronicDevices
{
	void on()
	{
		System.out.println("T.V. is now ON...");
	}
	void off()
	{
		System.out.println("Wait for OFF...");
	}
	void voltage()
	{
		System.out.println("Voltage required : 200V");
	}
	
}
class Radio extends ElectronicDevices
{
	void on()
	{
		System.out.println("Radio is now ON... Searching frequency");
	}
	void off()
	{
		System.out.println("Radio is going to OFF...");
	}
	void voltage()
	{
		System.out.println("Voltage required : 30V");
	}
}
public class ExecuteDevices
{
	public static void main(String  args[])
	{
		Television tv = new Television();
		Radio rd =  new Radio();
		
		tv.on(); tv.off(); tv.voltage();
		rd.on(); rd.off(); rd.voltage();
	}
}




