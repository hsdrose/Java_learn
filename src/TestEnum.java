
public class TestEnum
{
    public  void judge(Seasonn s) 
    {
    	//switch 语句里的表达式可以枚举值
    	switch (s)
		{
		case SPRING:
			System.out.println("春暖花开，正好踏青");
           break;
          case SUNMMER:
        	  System.out.println("夏日炎炎，适合游泳");
        	  break;
          case FALL:
        	  System.out.println("秋高气爽，大丰收");
        	  break;
           case WINTER:
        	   System.out.println("冬日雪花，白雪皑皑");
        	   break;
		}
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      //所有枚举类都有一个values方法，返回该枚举类的所有实例
		for (Seasonn s : Seasonn.values())
		{
			System.out.println(s);
		}
		//平常使用枚举实例，总是通过EnumClass.variable形式来访问
		new TestEnum().judge(Seasonn.SPRING);
	}

}
