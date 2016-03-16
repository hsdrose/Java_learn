import  java.io.*;
public class FilenameFilterTest 
{
	public static void main(String[] args) {
			File file=new File(".");
			String[] nameList=file.list(new MyFilenameFilter());
			for (String name:nameList) {
				System.out.println(name);
			}
		}	 
}
//实现自己的FilenameFilter实现类
class MyFilenameFilter implements FilenameFilter
{
	public  boolean accept(File dir , String name)
	{
		//如果文件名以.ini结尾，或者一个文件对应一个路径，返回true
		return name.endsWith(".ini") || new File(name).isDirectory();
	}
}