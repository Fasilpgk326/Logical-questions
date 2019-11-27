package patterns;

import java.util.Scanner;

public class patt2 {
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	int i;
	for(i=0;i<n;i++)//for rows
	{
		for( int j=n-i;j<=n;j++) //for space
		{
			for(j=0;j<=i;j++)
			{
				System.out.println("* ");
		    }
			System.out.println( );
	    }
	
	}
}}

