import java.lang.*;
public class TestThrow
{
	public static void main(String[] args)
	{
		try
		{
			//调用带throws声明的方法，必须显示捕获该异常
			//否则必须在main方法中再次声明
			throwChecked(-3);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		throwRuntime(3);
	}
	public static void throwChecked(int a) throws Exception
	{
		if(a>0)
		{
			//自行抛出Exception
			//该代码必须处于try快里，或处于throws的声明方法中		
			throw new Exception("a的值大于0，不符合要求");
		}
	}
	public static void throwRuntime(int a)
	{
		if(a>0)
		{
			//自行抛出RuntimeException异常，既可以显示补货异常
			//也可以不完全理会该异常
			throw new RuntimeException("a的值大于0，不符合要求");
		}
	}
}
