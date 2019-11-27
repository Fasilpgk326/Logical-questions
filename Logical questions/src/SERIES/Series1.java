package SERIES;

import java.util.Scanner;

public class Series1 {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=11,b=0;
		for(int i=1;i<=n;i++)
		{
			b=a*a;
			System.out.println(b);
			a=a+4;
		}
	}
	

}
