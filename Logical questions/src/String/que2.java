package String;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class que2 {
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String c=sc.next();
		System.out.println("enter the host");
		String st=sc.next();
		String s=c.concat(st);
		char m[]=s.toCharArray();
		Arrays.sort(m);
	
		System.out.println("Enter a name2");
		String c1=sc.next();
		char m1[]=c1.toCharArray();
		Arrays.sort(m1);
		String a=new String(m);
		String a1=new String(m1);
		
		if(a.contentEquals(a1))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}