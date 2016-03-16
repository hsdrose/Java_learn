import java.io.*;
public class PrintSteamTest
{
	public static void main(String[] args) throws IOException{
			PrintStream ps=null;
			try	
			{
				FileOutputStream fos=new FileOutputStream("test.txt");
				ps=new PrintStream(fos);
				//使用PrintStream执行输出
				ps.println("普通字符串");
				ps.println(new PrintSteamTest());
			}
			catch(IOException ioe)
			{
				ioe.printStackTrace(ps);
			}
			finally
			{
				ps.close();
			}
		}	
}