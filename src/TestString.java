import java.util.*;
import java.lang.*;
public  class TestString {
	public static void main(String[] args) {
		String  s=new  String("abcdefg");
		String  s1=new String("abcdefgs");
		String  s2=new String("abcdefghi");
		System.out.println("s1.compareTo(s2)"+s1.compareTo(s2));
		String  s3=new String("fghi");
		System.out.println("s2.endWith(s3)"+s2.endsWith(s3));
		//char[]  s4="I  love   java";
		//s3.getChars(0,3,s4,7);
		//System.out.println(s4);
		String  ss=new String ("write once, run anywhere!");
		String  ss1=new String("run");
		System.out.println("ss.indexOf('r')"+ss.indexOf('r'));
		System.out.println("ss.indexOf('r',2)"+ss.indexOf('r',2));
		System.out.println("ss.indexOf(ss1):"+ss.indexOf(ss1));
		String  ss2=new String("once");
		String  ss3=new String("write");
		System.out.println("ss.startsWith(ss3):"+ss.startsWith(ss3));
		System.out.println("ss.startsWith(ss2,6):是"+ss.startsWith(ss2,6));
		System.out.println("ss.substring():"+ss.substring(4));
		System.out.println("ss.substring():"+ss.substring(4,10));
		System.out.println("ss.toUpperCase()"+ss.toUpperCase());
	}
}
