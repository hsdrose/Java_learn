import java.util.*;
import java.io.*;
import java.lang.*;
public  class TestSystem 
{
   public static void main(String[] args) throws Exception{
   		Map<String,String> env=System.getenv();
   		for (String name:env.keySet()) {
   		System.out.println(name+"----->"+env.get(name));
   		}
   		//获取指定环境变量的值
   		System.out.println(System.getenv("JAVA_HOME"));
   		///将所有系统有属性
   	    Properties props=System.getProperties();
   	    //将所有系统属性保存到props.txt
   	    props.store(new FileOutputStream("props.txt"),"System Properties");
   	    System.out.println(System.getProperty("os.name"));
   	}	
}