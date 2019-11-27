package patterns;

import java.util.Scanner;

public class Cccssskkk {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("limit :");
		int n=s.nextInt();
		int i,j,k,p;
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{                               //for printing c
				System.out.print("R");
			}
			for(k=0;k<=i;k++)                   // for printing s
			{
				System.out.print("C");
			}
			for(p=0;p<=i;p++)
			{                                // for k
				System.out.print("B");
			}
			System.out.println();
		}
	}

}
