import java.lang.*;
public class TestIdentityHashCode 
{  
	public static void main(String[] args) {
		//下面程序中s1和s2时两个不同对象
		//因为String重写了hasCode()方法，改为根据字符序列计算hashCode值
		//因为s1和s2的字符序列相同，所以hashCode返回值是相同
		String s1=new String("Hello");
		String s2=new String("Hello");
		System.out.println(s1.hashCode()+"-------"+s2.hashCode());
		//s1和s2是不同的字符串对象，所以他们的identityHashCode返回值相等
		System.out.println(System.identityHashCode(s1)+"------"+System.identityHashCode(s2));
		String s3="java";
		String s4="java";
		//s3和s4是相同的字符串对象，所以你们的identiyHashCode返回值相同
		System.out.println(System.identityHashCode(s3)+"-------"+System.identityHashCode(s4));
	}
	
}