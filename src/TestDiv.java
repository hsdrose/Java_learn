import java.lang.*;
public class TestDiv
{
	public static void main(String[] args)

	{
		try
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=a/b;
			System.out.println("你输入的两个数的结果是："+a/b);

		}
		catch(IndexOutOfBoundsException ie)
		{
			System.out.println("数组越界：运行程序是输入的参数不够");
		
		}
		catch(NumberFormatException ne)
		
		{
			System.out.println("数字格式异常：程序只能接受整数参数");
		}
		catch(ArithmeticException ae)
		
		{
			System.out.println("算术异常");
		}
		catch(Exception e)
		
		{
			System.out.println("未知异常");
		}
	}
}
