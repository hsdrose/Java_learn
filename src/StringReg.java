import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.*;
import java.util.*;
public class  StringReg
{
	public  static  void main(String[] args)
	{
		String []  msgs=
		{
			"java has regular expression in 1.4",
			"regular expression now ",
			"java represses oracular"
		};
		for (String msg: msgs)
		{
			System.out.println(msg.replace("re\\w","哈哈\1"));
			System.out.println(Arrays.toString(msg.split(" ")));
		}
	}
}
