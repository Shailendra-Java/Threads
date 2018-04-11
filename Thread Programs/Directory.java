/* Importing Scanner class for input */
import java.util.Scanner;

public class Directory
{
	private void menu()
	{
		System.out.println("MENU");
		System.out.println("=======================");
		System.out.println("1 ) Create Directory");
		System.out.println("2 ) Delete Directory");
		System.out.println("3 ) Show Drirectory");
		System.out.println("4 ) Exit");
	}
	private void operation()
	{
		int choice;
		Scanner scan = new Scanner(System.in);
		Directory dir = new Directory();
		dir.menu();
		System.out.println("Enter your choice");
		choice = scan.nextInt();	
		
		switch(choice)
		{
			case 1:
				System.out.println("Directory Created");
				break;
			case 2:
				System.out.println("Directory Deleted");
				break;
			case 3:
				System.out.println("Showing Directory");
				break;
			default:
				System.out.println("Invalid choice");
		}
	}
	public static void main(String args[])
	{
		Directory dir = new Directory();
		dir.operation();
	}	
}