import java.util.ArrayList;
import java.util.List;

//如果希望创建一个List对象，且该List对象中只能保存字符串类型，那我们可以扩展ArrayList,
//自定义一个StrList集合类，使组合的方式来复用ArrayList类
class StrList {
    private  List strList=new ArrayList();
    public boolean add(String ele) {
		return strList.add(ele);
	}
    //重写get方法，将get方法的返回值类型改为String类型
    public String get(int  index) {
		return (String)strList.get(index);
	}
    public int size() {
		return strList.size();
	}
}
public class CheckType {    
	public static void main(String[] args) {
     StrList strList=new StrList();
     strList.add("Strusts权威指南");
     strList.add("基于J2EE的Ajax宝典");
     strList.add("轻量级J2EE企业应用实战");
//     strList.add(5); 代码经引起编译错误
     System.out.println(strList);
     for (int i = 0; i < strList.size(); i++) {
		String str=strList.get(i);
		System.out.println(str);
	}
     
	}

}
