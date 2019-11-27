package patterns;

import java.util.Scanner;

public class string3 {
public static void main(String[] arg)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=s.nextInt();
	int a=65;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print((char)a+"");
			a++;
		}
		System.out.println();
	}
}
}
 