abstract class Device 
{
	 private String name;
	 public abstract double getPrince();
	 public Device(){}
	 public Device(String name)
	{
		this.name=name;
	} 
	 public void setName()
	 {
		 this.name=name;
	 }
	 public String getName()
	 {
		 return  this.name;
	 }
}
public class AnonymousInner {
  
	public void test(Device d)
	{
		System.out.println("������һ��"+d.getName()+",������"+d.getPrince());
	}
	public static void main(String[] args) {
	 AnonymousInner ai=new AnonymousInner();
	 ai.test(new Device("����ʾ����")
	{
		public double getPrince()
		{
			// TODO Auto-generated method stub
			return 67.8;
		}
	});
	 Device d=new  Device()
	{
		 {
			 System.out.println("�����ڲ���ĳ�ʼ��������");
		 }
		@Override
		public double getPrince()
		{
			// TODO Auto-generated method stub
			return 25.2;
		}
		public String getName()
		{
		  return "����";
		}
	};
	ai.test(d);

	}

}
