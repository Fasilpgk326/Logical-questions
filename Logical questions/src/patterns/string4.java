package patterns;

import java.util.Scanner;

public class string4 {
	public static void main (String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		for(int i=n;i>=1;i--)
		{
		for(int j=i;j>=1;j--)
		{
			System.out.printf(" %c",j+64);
			
		}
		System.out.println("");
		}
	}

}
