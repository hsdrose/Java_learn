import java.util.*;
import java.io.*;
public class TestBufferedReader 
{
	public static void main(String[] args) throws IOException {
		BufferedReader   br =new BufferedReader(new InputStreamReader(System.in));
		String buffer=null;
		while((buffer=br.readLine())!=null)
		{
			System.out.println("用户键盘输入的是 ："+buffer);
		}
	}
	
}