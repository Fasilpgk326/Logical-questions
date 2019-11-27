package patterns;

import java.util.Scanner;

public class Hashtag {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<2*n+1;j++)
			{
				if(i+j==n||j-i==n)
				{
					System.out.printf(" *");
				}
				else
				{
					System.out.print(" #");
				}
				
			}
			System.out.println();
		}
		
	}

}
