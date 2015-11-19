import java.util.*;
import java.lang.*;
public class FindGroup
{
	public  static  void  main(String []  args)
	{
		//创建一个Pattern对象，并用它建立一个Macther对象
		Pattern  p=Pattern.compile("\\w+");
		Matcher  m=p.matcher("Java is  very easy !");
		while (m.find())
		{
			System.out.println(m.group());
		}
		int i=0;
		while (m.find(i))
		{
			System.out.println(m.group()+"\t");
			i++;
		}
	}
}
