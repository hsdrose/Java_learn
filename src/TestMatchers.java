import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TestMatchers
{
	public static void main(String[] args)
	{
		String []  mails=
		{
			"kongyeeku@163.com",
			"kongyeeku@gmail.com",
			"ligang@oneedu.com",
			"wawa@abc.xx"
		};
		String mailRegEx="\\w{3,20}@\\w+\\.(com|org|cn|org|net|gov)";
		Pattern mailPattern=Pattern.compile(mailRegEx);
		Matcher  matcher=null;
		for(String mail : mails)
		{
			if(matcher==null)
			{
				matcher=mailPattern.matcher(mail);
			}
			else 
			{
				matcher.reset(mail);
			}
			if(matcher.matches())
			{
				System.out.println(mail+"这是个有效的邮件地址");
			}
			else
			{
				System.out.println(mail+"这是一个无效的邮件地址");
			}
		}
	}
}
