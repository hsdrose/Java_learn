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
		//������佫��ʾ���������ڲ����ڷ��ʾֲ���������ʹ��final����
		public void test()
		{
			// TODO Auto-generated method stub
			System.out.println( age);
		}
	};
	}

}
