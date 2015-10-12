public class TestFinalize
{
    private static TestFinalize tf=null;
    public void info()
    {
    	System.out.println("测试资源清理的finalize方法");
    }
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		//创建TestFinalize对象立即进入去活状态
		new  TestFinalize();
		//通知系统进行资源回收
		System.gc();
		//让程序暂停两秒
//       Thread.sleep(2000);、
		//强制垃圾回收机制调用去活对象的finalize的方法
		Runtime.getRuntime().runFinalization();
//		System.runFinalization();
        tf.info();
	}
public void finalize()
{
	//让tf引用到试图回收的去多
	tf=this;
}
}
