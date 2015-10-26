//class Apple
//{
//	private Object info;
//	public Apple(){}
//	public  Apple(Object info)
//	{
//		 this.info=info;
//	}
//	public void setInfo(Object info)
//	{
//		this.info=info;
//	}
//	public Object getInfo()
//	{
//		return this.info;
//	}
//}
public class Apple<T>
{
	// 使用T类型形参定义属性
	private T info;

	public Apple()
	{
	}

	public Apple(T info)
	{
		this.info = info;
	}

	public void setInfo(T info)
	{
		this.info = info;
	}

	public T getInfo()
	{
		return this.info;
	}

	public static void main(String[] args)
	{
		// 因为传给T形参的是String 实际类型，所以构造器的参数只能是String
		Apple<String> a1 = new Apple<String>("苹果");
		Apple   a3=new Apple(new String("haha"));
		System.out.println(a3);
		System.out.println(a1.getInfo());
		Apple<Double>  a2=new Apple<Double>(5.67);
		System.out.println(a2.getInfo()	);
	}

}
