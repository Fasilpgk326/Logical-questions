package patterns;

import java.util.Scanner;

public class pyramid {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a number");
     int n=s.nextInt();
     int i,j,k;
     for(i=1;i<=n;i++)
     {
    	 for(j=1;j<=i;j++)
    	 {
    		 System.out.print(j);
    		
    	}
     for(k=i;k<n;k++)
     {
    	 System.out.print(" ");
     }
     for(j=i;j>=1;j--)
     {
    	 System.out.print(j);
    	 
     }
     System.out.println();
	}
	}
}

