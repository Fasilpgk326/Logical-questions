package palindrime;

import java.util.Scanner;

public class ssss {
	
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
        String str=s.nextLine();
		int leng=str.length();
		String b="";
		for(int i=leng-1;i>=0;i--)
		{
		b=b+str.charAt(i);	
		}
		System.out.println(b);

		if(str.equals(b))
		{
			System.out.println("is palindreome");
		}
		else {
			System.out.println("is not palindrome");
		}
	}
}