package patterns;

import java.util.Scanner;

public class hello {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String");
		String st=s.next();
		for(int i=0;i<st.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.printf("%c ",st.charAt(j));
		    }
			System.out.println();
		}
		
	}

}
