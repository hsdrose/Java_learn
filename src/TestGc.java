public class TestGc
{
   private double height;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
  for (int i = 0; i < 4; i++)
{
	 new TestGc();
	 //下面两行代码的作用完全相同，强制系统进行垃圾回收
	 System.gc();
//	 Runtime.getRuntime().gc();
}
	}
  public void finalize()
  {
	  System.out.println("系统正在清理TsetGc对象的资源");
  }
}
