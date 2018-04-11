package com.example.max;

public class Maximum
{
	int x,y,z;
	private void getMax()
	{
		x = 11;
		y = 23;
		z = 15;
		if(x>y && x>z)	
			System.out.println("Largest no. "+x);
		else if(y >x && y>z)
			System.out.println("Largest no. "+y);
		else
			System.out.println("Largest no. "+z);
	}
	public static void main(String ar[])
	{
		Maximum max = new Maximum();
		max.getMax();
	}

}