import java.util.*;
public class TestUnmodifiable {

	public static void main(String[] args) {
	//创建一个空的不可改变的List对象
    List unmodifiableList=Collections.emptyList();
    //创建一个只有一个元素，且不可改变的Set对象
    Set  unmodifiableSet=Collections.singleton("Struts权威指南");
    Map scores=new HashMap();
    scores.put("java", 89);
    scores.put("Chinese", 86);
    //返回普通Map对象对应的不可变版本
    Map unmodifiableMap=Collections.unmodifiableMap(scores);
/*    unmodifiableList.add("测试元素");
    unmodifiableSet.add("测试元素");
    unmodifiableMap.put("数学", 90);*/
    System.out.println(unmodifiableMap);
    
	}

}
