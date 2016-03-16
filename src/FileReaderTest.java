import java.io.*;
public class FileReaderTest 
{
	public static void main(String[] args) throws IOException{
		FileReader fr=null;
		try	
		{
			fr=new FileReader("../src/FileReaderTest.java");
			char[]  cbuf=new char[32];
			int hasRead=0;
			while ((hasRead=fr.read(cbuf))>0) {
				System.out.println(new String(cbuf,0,hasRead));
			}
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		finally
		{
			if(fr!=null)
			{
				fr.close();
			}
		}
	}
}