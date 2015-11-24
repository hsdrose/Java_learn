import java.lang.*;
class  SelfException  extends  Exception
{
	SelfException(){}
	SelfException(String msg)
	{
		super(msg);
	}
}
public class TestPrintStackTrace
{
	public static void main(String[]  args) throws SelfException
	{
		firstMethod();
	}
	public static void firstMethod ()  throws SelfException
	{
		secondMethod();
	}
	public static  void secondMethod () throws  SelfException
	{
		thirdMethod();
	}
	public static  void thirdMethod()  throws  SelfException
	{
		throw new SelfException("自定义异常信息");
	}
}
