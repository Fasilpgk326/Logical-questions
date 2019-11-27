
package String;

import java.util.Scanner;

public class regist {
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int booked[]=new int[25];
		
		StringBuffer s=new StringBuffer();
		int i=1;
		do
		{
		System.out.println("Registration");
		
		System.out.println("Enter your name");
		s.append(sc.next()+"\n");
		System.out.println("Enter your address");
		s.append(sc.next()+"\n");
		System.out.println("Enter your contact number");
		s.append(sc.nextInt()+"\n");
		System.out.println("Enter your Emali-ID");
		s.append(sc.next()+"\n");
		System.out.println("Enter your proof type");
		s.append(sc.next()+"\n");
		System.out.println("Enter proof id");
		s.append(sc.next()+"\n");
		booked[i]=1;
		System.out.println("Thank you for registering your id is"+i);
		i++;
		System.out.println("Don you want to continue reg");
		if(sc.next().equals("no"))
		{
			System.out.println("Do you want to update email id(y/n)");
			if(sc.next().equals("yes"))
			{
				System.out.println("Your details are");
				System.out.println("Enter new email");
				s.append("New email :"+sc.next()+"\n");
				System.out.println("Email updated");
				System.out.println();
			}
			System.out.println("Your details are");
			System.out.println();
			System.out.println(s);	
			}
		}
		while(sc.next().equals("yes"));
	}

}
