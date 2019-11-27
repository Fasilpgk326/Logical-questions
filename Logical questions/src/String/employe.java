package String;

import java.util.Scanner;

public class employe {
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		
		StringBuilder s=new StringBuilder();
		System.out.println("Enter the name");
		s.append("Name :"+sc.next()+"\n");
		System.out.println("Enter  ID number");
		s.append("ID No."+sc.next()+"\n");
		System.out.println("age");
		s.append("age :"+sc.nextInt()+"\n");
		System.out.println("salary");
		s.append("Salary"+sc.nextInt()+"\n");
		System.out.println("***employe details***");
		System.out.println(s);
		
	}

}
 