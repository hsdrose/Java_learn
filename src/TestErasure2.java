import java.util.*;
public class TestErasure2 {

	public static void main(String[] args) {
    List<Integer> li=new ArrayList<Integer>();
    li.add(6);
    li.add(9);
    System.out.println(li);
    List  list=li;
    System.out.println(list);
    List<String> ls=list;
    //下面代码将出现引起“未经检查的转换的警告，编译，运行都不报错，只要访问ls元素出现异常”
//    System.out.println(ls.get(0));
    
	}

}
