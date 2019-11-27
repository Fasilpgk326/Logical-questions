package patterns;

import java.util.Scanner;

public class dimond {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int i,j,k;
		int star=1;
		int space=1;
		for(i=1;i<n;i++)
		{
			for(j=1;j<=space;j++)
			{
				System.out.println("");
				
			}
			for(k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			System.out.println();                                   																																																																																																																																																																																											
		}
		star=star+2;
	System.out.println();
	}
	
}
