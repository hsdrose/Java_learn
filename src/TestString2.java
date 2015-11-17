import java.util.*;
import java.lang.*;
public class  TestString2
{
	public  static  void  main(String[] args)
	{
		String s0="Hello";
		String s1="help";
		String s2="He"+"llo";
		System.out.println(s0==s1);
		System.out.println(s0==s2);
		System.out.println(new String("help")==new String("help") );
	}
}
