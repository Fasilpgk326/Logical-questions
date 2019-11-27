package patterns;

import java.util.Scanner;

public class Zerochang {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i,j;
		for(i=1;i<=n;i++)//for row
		{
			for(j=1;j<=n;j++)//for coloum
			{
				if(i==j)
				{
					System.out.print("0");//print 0
				}
				else
				{
					System.out.print(i);//remain palce print the value 
				}
			}
			System.out.println();
		}
	}
	

}
