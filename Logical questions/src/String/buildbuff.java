package String;

public class buildbuff {
	public static void main(String[] arg)
	{
		//stringbuff
		StringBuffer s=new StringBuffer("hello");
		s.append(" face");
		System.out.println(s);
		
		//stringBuilder
		
		StringBuilder b=new StringBuilder("hello");
		b.append("face");//add 2value
		b.insert(5," the ");//insert value into the indexno.
		b.replace(5,6," welcomee ");//replace to index value
		b.deleteCharAt(13);//delete the char
		b.delete(5,13);//delete char btwn given index num
		System.out.println(b);
	}

}
