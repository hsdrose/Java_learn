
public class TestGender
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//通过Enum的valueOf方法获取指定枚举类的枚举值
     Gender g=Enum.valueOf(Gender. class,"FEMALE");
      g.setName("女");
      System.out.println(g+"代表："+g.getName());
      g.setName("男");
      System.out.println(g+"代表"+g.getName());
	}

}
