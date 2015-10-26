import java.util.*;
public class ListErr {

	public static void main(String[] args) {
    List strList = new  ArrayList();
    strList.add("Struts权威指南");
    strList.add("轻量级J2EE企业的Ajax宝典");
    strList.add("基于J2EE企业应用实战");
    strList.add(5);
    for (int i = 0; i < strList.size(); i++) {
    	//因为List里取出来全部是object，所以必须强制类型转换
    	//最后一个元素将出现ClassCastException异常
		String str=(String)strList.get(i);
		System.out.println(str);
	}
	}

}
