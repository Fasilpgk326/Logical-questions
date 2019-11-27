package String;

import java.util.Scanner;

public class leng {
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	String s1="The face";
	String s2="academy";
	System.out.println("length of The face:"+s1.length());//length
	System.out.println("length of academy:"+s2.length());
	System.out.println("index value of ac:"+s1.indexOf("ac"));//find the index
	System.out.println("index value of em:"+s2.indexOf("em"));
	System.out.println("sub string of face:"+s1.substring(0,4));// for substring
	System.out.println("sub String Of academy:"+s2.substring(3,7));
	System.out.println("s1 Start with the:"+s1.startsWith("the")); //check start with 
	System.out.println("s2 start with capital:"+s2.startsWith("A"));
	System.out.println("concatination:"+s1.concat( s2));// join the 2 strings
	System.out.println("concat:"+s2.concat(s1));
	System.out.println("replacing :"+s1.replace("T","t"));//replacing 2words
	System.out.println("repalcing:"+s2.replace("c","C"));
    
    String word[]=s1.split(" ");
    		for(String a:word)
    		{
    System.out.println(a);
    		}
    String[] a=s2.split("d");//split the sentance
    for(String b:a)
    {
    	System.out.println(b);
    }
    System.out.println("these 2 strings are equals:"+s1.equals(s2));    
}


}
