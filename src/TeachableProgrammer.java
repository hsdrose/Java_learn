public class TeachableProgrammer   extends Programmer
{
   public TeachableProgrammer(){}
   public   TeachableProgrammer(String name)
{
	super(name);
}
   //教学工作依然由TeachableProgrammer类定义
   private  void teach()
   {
	   System.out.println(getName()+"老师在台上讲解。。");
   }
   private class Closure implements Teachable 
   {
//	   非静态内部类回调外部类实现work方法，非静态内部类引用的作用仅仅是
//	   向客户类提供一个回调外部类的途径
	   @Override
	public void work()
	{
		teach();
		
	}
   }
   //返回一个非静态内部引用类，允许外部类通过该非静态内部类引用来回调用外部的方法
   public Teachable getCallbackReference()
   {
	  return new Closure();
   }
public static void main(String[] args)
{
	TeachableProgrammer  pro=new TeachableProgrammer("王洪福");
	pro.work();
	pro.getCallbackReference().work();
}
}
