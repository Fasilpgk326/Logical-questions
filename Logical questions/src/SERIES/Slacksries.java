package SERIES;

import java.util.Scanner;

public class Slacksries {
	public static void main(String[] arg)
	{
	Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 int a=0;int b=0;
	try { if(n%2==0)
	 {
		 for(int i=0;i<=(n-2);i=i+2)
		 {
			 a=a+2;
			 b=a/2;
		 }
		 System.out.println(b);
	 }
	 else
	 {
		 for(int i=1;i<=(n-2);i=i+2)
		 {
			 a=a+2;
			 b=a/2;
		 }
	  System.out.println(a);
	 }
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	} }
	 
	
	

