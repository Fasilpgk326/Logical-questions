package String;

import java.util.Scanner;

public class reverse {
public static void main(String[] args)

{
	Scanner s=new Scanner(System.in);
	String para=s.nextLine();        //paragraph
   	String word[]=para.split(" ");          //split the para as array
   	for(int i=0;i<word.length;i++)//length of para
   	{
   		if(i%2!=0)//checking the possition eg:0 1 2 3
   		{
   			int length=word[i].length();
   		    for(int j=length-1;j>=0;j--)//check the reverse 
   		    {
   		    	System.out.print(word[i].charAt(j));// check values printing
   		    	
   		    }
   		 System.out.print(" ");
   		}
   		else
   		{
   			System.out.print(word[i]+" ");
   		}
   	}
}
}
