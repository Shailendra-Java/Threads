public class Loop
{
	public static void main(String a[])
	{
		int i, no = 20;
		for(i=1; i<=no; i++)
		{
			if(i==16)
				break;
			if(i == 8)
				continue;
			System.out.print(i+"\t");
		}
	}
}

