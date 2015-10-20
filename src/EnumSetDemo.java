import java.util.EnumSet;

enum Month
{
	SPRING,SUMMER,FALL,WINTER
}
public class EnumSetDemo
{

	public static void main(String[] args)
	{
		//创建一个Enum集合，集合元素就是Season枚举的全部枚举值
		EnumSet  es1=EnumSet.allOf(Month.class);
		//输出集合
		System.out.println(es1);
		//创建一个EnumSet空集合，指定起集合元素Month类的枚举值
		EnumSet es2=EnumSet.noneOf(Month.class);
       System.out.println(es2);
       //添加元素
       es2.add(Month.WINTER);
       es2.add(Month.SUMMER);
       System.out.println(es2);
      //以指定的枚举值创建EnumSet集合
       EnumSet  es3=EnumSet.of(Month.SUMMER , Month.FALL);
       System.out.println(es3);
       EnumSet es4=EnumSet.range(Month.SPRING, Month.WINTER);
       System.out.println(es4);
       //新创建的EnumSet集合的元素和es4集合的元素有相同类型
       //es5的集合元素+es4集合元素= month全部的枚举值
       EnumSet es5=EnumSet.complementOf(es4);
       System.out.println(es5);
       
	}

}
