import java.util.*;
import java.io.*;
public class TestScannerFile
{
	public static void main(String[] args) throws Exception {
		Scanner fl=new Scanner(new File("a.txt"));
		System.out.println("a.txt 的文件内容如下: ");
		while(fl.hasNextLine())
		{
			System.out.println(fl.nextLine());
		}
	}
}