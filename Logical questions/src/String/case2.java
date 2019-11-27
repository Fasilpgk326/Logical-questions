package String;

import java.util.Scanner;

public class case2 {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		StringBuilder b=new StringBuilder();
		car ca=new car();
		bike bi=new bike();
		System.out.println("1)car \n2)bike");
	   	int n=s.nextInt();
		switch(n)
		{
		case 1:ca.display();
		break;
		case 2:bi.display();
		break;
		default:System.out.println("Invalid option");
		
		}
	}
}
class car
{
	public void display()
	{
		Scanner s=new Scanner(System.in);
		StringBuilder c=new StringBuilder();
		System.out.println("Enter details of car");
		System.out.println("Enter the colour");
		c.append("Colour :"+s.next()+"\n");
		System.out.println("Enter the maximum speed");
		c.append("Speed :"+s.next()+"\n");
		System.out.println("Enter the number of seat");
		c.append("no of seat :"+s.next()+"\n");
		System.out.println("Enter the number of wheels");
		c.append("no of wheels"+s.next()+"\n");
		System.out.println("Enter the number of doors");
		c.append("no.of doors"+s.next()+"\n");
		System.out.println("Enter the status of AC(true/false)");
		c.append("AC :"+s.next()+"\n");
	    System.out.println(c);
	}
}
class bike
{
	public void display()
	{
		Scanner s=new Scanner(System.in);
		StringBuilder b=new StringBuilder();
		System.out.println("Enter the detais of car");
		System.out.println("Enter the colour");
		b.append("colour :"+s.next()+"\n");
		System.out.println("Enter the maximum speed");
		b.append("speed :"+s.next()+"\n");
		System.out.println("enter the number of wheels");
		b.append("no.of wheels:"+s.next()+"\n");
		System.out.println("Enter the status of disk break(true/false)");
		b.append("Disk:"+s.next()+"\n");
		System.out.println(b);
		 
		
	}
}