import java.util.Scanner;

public class One_D_Array
{
	
	void getData()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 5 elements");
		for(int i = 0; i<5; i++)
		{
			System.out.println(i+1+": Element");
			num[i] = scan.nextInt();
		}
	}
	void showData()
	{
		System.out.println("Array elements are...");
		for(int j: num)
			System.out.print(j+"\t");
	}
	public static void main(String[] arg)
	{
		One_D_Array oda = new One_D_Array();
		oda.getData();
		oda.showData();
	}
}