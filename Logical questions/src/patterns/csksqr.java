package patterns;

import java.util.Scanner;

public class csksqr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int i,j;
     for(i=0;i<n;i++)
     {
    	 for(j=0;j<n;j++)
    	 {
    		 if(i==1||i==4||j==1||j==4)
    		 {
    			 System.out.print("*");
    		 }
    		 System.out.println();
    		 
    	 }
     }
	}
	

}
