package String;

import java.util.Scanner;

public class check {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String p=s.nextLine();
	int	smcount=0,capcount=0,numcount=0,spcount=0,vocount=0;
	for(int i=0;i<=p.length();i++)
	{
	char c=p.charAt(i);
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
	{
		vocount++;
	}
	}
    }

}
