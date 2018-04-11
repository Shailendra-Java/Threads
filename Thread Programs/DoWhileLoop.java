import java.util.Scanner;
public class DoWhileLoop
{
	public static void main(String a[])
	{
		int no = 0;
		Scanner scan = new Scanner(System.in);
		do
		{
			System.out.println("Enter 0 to break loop");
			no = scan.nextInt();
		}while(no != 0);
	}
}

