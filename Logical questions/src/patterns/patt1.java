package patterns;

import java.util.Scanner;

public class patt1 {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)//for rows
		{
			for(int j=1;j<=i;j++)//for coloums
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
	}

}
