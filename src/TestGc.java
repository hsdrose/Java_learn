public class TestGc
{
   private double height;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
  for (int i = 0; i < 4; i++)
{
	 new TestGc();
	 //�������д����������ȫ��ͬ��ǿ��ϵͳ������������
	 System.gc();
//	 Runtime.getRuntime().gc();
}
	}
  public void finalize()
  {
	  System.out.println("ϵͳ��������TsetGc�������Դ");
  }
}
