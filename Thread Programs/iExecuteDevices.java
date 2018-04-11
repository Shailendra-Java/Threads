package com.example._interface;

interface ElectronicDevices
{
	 public void on();
	 public void off();
	 public void voltage();
	
}
interface Current extends ElectronicDevices
{
	public String currentType();
}
class Television implements Current
{
	public void on()
	{
		System.out.println("T.V. is now ON...");
	}
	public void off()
	{
		System.out.println("Wait for OFF...");
	}
	public void voltage()
	{
		System.out.println("Voltage required : 200V");
	}
	public String currentType()
	{
		return "A.C. Current";
	}
	
}
class Radio implements ElectronicDevices
{
	public void on()
	{
		System.out.println("Radio is now ON... Searching frequency");
	}
	public void off()
	{
		System.out.println("Radio is going to OFF...");
	}
	public void voltage()
	{
		System.out.println("Voltage required : 30V");
	}
}
public class iExecuteDevices
{
	public static void main(String  args[])
	{
		Current tv = new Television();
		ElectronicDevices rd =  new Radio();
		
		tv.on(); tv.off(); tv.voltage(); 
		System.out.println("T.V. uses "+tv.currentType());
		rd.on(); rd.off(); rd.voltage();
	}
}




