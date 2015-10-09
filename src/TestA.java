interface A
{
	void test();
}
public class TestA
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
    int  age=0;
    A a=new A()
	{
		
		@Override
		//下面语句将提示错误：匿名内部类内访问局部变量必须使用final修饰
		public void test()
		{
			// TODO Auto-generated method stub
			System.out.println( age);
		}
	};
	}

}
