import java.io.*;
public class FileWriterTest 
{
	public static void main(String[] args) throws IOException{
			FileWriter fw=null;
			try
		{
			fw = new FileWriter("poem.txt");
			fw.write("½õÉª - ÀîÉÌÒþ\r\n"); 
			fw.write("½õÉªÎÞ¶ËÎåÊ®ÏÒ£¬Ò»ÏÒÒ»ÖùË¼»ªÄê¡£\r\n");
			fw.write("×¯ÉúÏþÃÎÃÔºûµû£¬ÍûµÛ´ºÐÄÍÐ¶Å¾é¡£\r\n");
			fw.write("²×º£ÔÂÃ÷ÖéÓÐÀá£¬À¶ÌïÈÕÅ¯ÓñÉúÑÌ¡£\r\n");
			fw.write("´ËÇé¿É´ý³É×·Òä£¬Ö»ÊÇµ±Ê±ÒÑã¯È»¡£\r\n");
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
		finally
		{
			if (fw != null)
			{
				fw.close();
			}
		}	
}
}