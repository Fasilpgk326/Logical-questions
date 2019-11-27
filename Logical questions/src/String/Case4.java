package String;

import java.util.Scanner;

public class Case4 {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		StringBuilder c=new StringBuilder();
		String st="qwertyuiop asdfghjkl; zxcvbnm,./";//keyboard values
		char chr[]=st.toCharArray();
		System.out.println("Enter the charachter");//for right or left
		char ch=s.next().charAt(0);
		System.out.println("Enter the string");
		String str=s.next();
		char chara[]=str.toCharArray();
		System.out.println("The orginal message");
		for(int i=0;i<str.length();i++)//given string values
		{
			for(int j=0;j<chr.length;j++)//keyboard values
			{
				if(chara[i]==(chr[j])&&ch=='R')
				{
					c.append(chr[j-1]);
				}
					if(chara[i]==(chr[j])&&ch=='L')
					{
						c.append(chr[j+1]);
					}
			}
			
		}
		System.out.println(c);
				
		
	}

}
