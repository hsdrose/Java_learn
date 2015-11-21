import  java.util.regex.Matcher;
import  java.util.regex.Pattern;
public class TestMatcher {
	public static void groupString(String rexp, String s) {
		Pattern p=Pattern.compile(rexp);
		Matcher m=p.matcher(s);
		boolean result=m.find();
		System.out.println("该次查找获得匹配数组的数量为"+m.groupCount());
		while(result){
			System.out.println(m.group(1));
			System.out.println(m.group(2));
			result=m.find();
		}
	}
	public static void main(String[] args) {
		String s="172.26.22.221 - - [26/Feb/2001:10:56:03 -0500]\"get/isAlive.html Http/1.0\"200 15";
		String rexp="([\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3})\\s\\-\\s\\-\\s\\[([^\\]]+)\\]";
		groupString(rexp,s);
	}
}