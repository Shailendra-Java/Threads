import java.util.Scanner;

public class Two_D_Array
{
	int[][] matrix = new int[3][3];
	int i,j;
	void getData()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 9 elements");
		for( i = 0; i<3; i++) //Rows
		{
			for( j = 0; j<3; j++) // Column
			{
				System.out.println("Enter matrix["+i+"]["+j+"] : ");
				matrix[i][j] = scan.nextInt();
			}
		}
	}
	void showData()
	{
		System.out.println("Array elements are...");
		for(i=0; i<3; i++)
		{
			for(j=0; j<3; j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] arg)
	{
		Two_D_Array oda = new Two_D_Array();
		oda.getData();
		oda.showData();
	}
}