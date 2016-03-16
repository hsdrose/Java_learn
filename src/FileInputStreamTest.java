import java.io.*;
public class FileInputStreamTest 
{
	public static void main(String[] args) throws Exception{
		//创建字节流输入流
		FileInputStream   fis=new FileInputStream("../src/FileInputStreamTest.java");
		//创建一个长度为1024的"竹筒"
		byte[]   bbuf=new byte[1024];
		//用于保存实际读取的字节数
		int hasRead=0;
		while ((hasRead=fis.read(bbuf))>0) {
			System.out.println(new String(bbuf,0,hasRead));	
		}
		fis.close();
 	}
}