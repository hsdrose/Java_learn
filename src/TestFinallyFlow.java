import java.lang.*;
public class TestFinallyFlow
{
	public static void main(String[] args) throw Exception
	{
		boolean a=test();
		System.out.println(a);
	}
	public static boolean test()
	{
		try
		{
			//因为finally块中包含了return语句，则下面的return语句市区作用
			return true;
		}
		finally
		{
			return  false;
		}
	}
}
