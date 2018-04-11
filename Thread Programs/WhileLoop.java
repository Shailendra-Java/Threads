import java.util.Scanner;
public class WhileLoop
{
	public static void main(String a[])
	{
		int no = 1;
		Scanner scan = new Scanner(System.in);
		while(no != 0)
		{
			System.out.println("Enter 0 to break loop");
			no = scan.nextInt();
		}
	}
}

