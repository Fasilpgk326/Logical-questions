package prime;

import java.util.Scanner;

class primeornot {
public	static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int i;
	int c=0;
	for(i=2;i<=n;i++)
	{
		if(n%i==0)
		{
			c++;
		}
		}
	if(c==1)
	{
		System.out.println("is a prime number");
	}
	else 
	{
		System.out.println("is not a prime number");
	}
	}
}


