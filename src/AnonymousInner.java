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
		System.out.println("购买了一个"+d.getName()+",花掉了"+d.getPrince());
	}
	public static void main(String[] args) {
	 AnonymousInner ai=new AnonymousInner();
	 ai.test(new Device("电子示波器")
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
			 System.out.println("匿名内部类的初始化。。。");
		 }
		@Override
		public double getPrince()
		{
			// TODO Auto-generated method stub
			return 25.2;
		}
		public String getName()
		{
		  return "键盘";
		}
	};
	ai.test(d);

	}

}
