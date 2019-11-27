package patterns;

import java.util.Scanner;

public class Crossstar {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
//				if(i==j||i==1&&j==5||i==2&j==4||i==4&&j==2||i==5&&j==1)
				if(i==j||(i+j)==(n-1))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("0 ");
				}
				
			}
		System.out.println();
		}
		
		
	
	}
}
