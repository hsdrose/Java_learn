import java.util.*;
import java.lang.*;
public class TestPatern
{
	public static void main(String[] args)
	{
		String str="Hello ,java !";
		//贪婪模式的正则表达式
		System.out.println(str.replaceFirst("\\w*","&"));
		//勉强模式的正则表达式
		System.out.println(str.replaceFirst("\\w*?","&"));

	}
}
