public class Demo
{
	int  result;
	int no1= 100;
	int no2=250;
	private int add()
	{
		result = no1 + no2;	
		return result;
	}
	private int sub(int x, int y)
	{
		return x - y;
	}
	
	public static void main(String[] args)
	{
		Demo demo = new Demo();
		System.out.println("Addition = "+demo.add());
		System.out.println("Subtraction = "+demo.sub(120,70));
	}
}