package String;

import java.util.Scanner;

public class Facehash {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("String 1");
        String st1=s.next(); 
        System.out.println("String 2");
        String st2=s.next();
        System.out.println("String 3");
        String st3=s.next();
        char ch1[]=st1.toCharArray();
        char ch2[]=st2.toCharArray();
        char ch3[]=st3.toCharArray();
        for(int i=0;i<st1.length();i++)
        {
        	if(ch1[i]=='a'||ch1[i]=='e'||ch1[i]=='i'||ch1[i]=='o'||ch1[i]=='u')
        	{
        	ch1[i]='$';
        }
        }
        for(int i=0;i<st2.length();i++)
        {
        	if(ch2[i]=='a'||ch2[i]=='e'||ch2[i]=='i'||ch2[i]=='o'||ch2[i]=='u')
        	{
        	ch2[i]=ch2[i];
        	}
        	else
        	{
        		ch2[i]='#';
        	}
        	
        }
        
        for(int i=0;i<st3.length();i++)
        {
        	if(ch3[i]>97&&ch3[i]<=122)
        	{
        		ch3[i]=(char)(ch3[i]-32);
        	}
        }
        String str1=String.valueOf(ch1);
        String str2=String.valueOf(ch2);
        String str3=String.valueOf(ch3);
        System.out.println(str1+str2+str3);
	}
	

}
