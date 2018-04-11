public class Demo
{
	int no1, no2, result;
	no1 = 100, no2 = 250;
	private int add()
	{
		result = no1 + no2;	
		return result;
	}
	private int sub(int x, int y)
	{
		return x - y;
	}
	private void showResult()
	{
		System.out.println("Addition = "+add());
		System.out.println("Subtraction = "+sub(120,70));
	}
	public static void main(String[] args)
	{
		Demo demo = new Demo();
		demo.showResult();
	}
}