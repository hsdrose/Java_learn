public class TeachableProgrammer   extends Programmer
{
   public TeachableProgrammer(){}
   public   TeachableProgrammer(String name)
{
	super(name);
}
   //��ѧ������Ȼ��TeachableProgrammer�ඨ��
   private  void teach()
   {
	   System.out.println(getName()+"��ʦ��̨�Ͻ��⡣��");
   }
   private class Closure implements Teachable 
   {
//	   �Ǿ�̬�ڲ���ص��ⲿ��ʵ��work�������Ǿ�̬�ڲ������õ����ý�����
//	   ��ͻ����ṩһ���ص��ⲿ���;��
	   @Override
	public void work()
	{
		teach();
		
	}
   }
   //����һ���Ǿ�̬�ڲ������࣬�����ⲿ��ͨ���÷Ǿ�̬�ڲ����������ص����ⲿ�ķ���
   public Teachable getCallbackReference()
   {
	  return new Closure();
   }
public static void main(String[] args)
{
	TeachableProgrammer  pro=new TeachableProgrammer("���鸣");
	pro.work();
	pro.getCallbackReference().work();
}
}
