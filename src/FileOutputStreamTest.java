import  java.io.*;
public class FileOutputStreamTest 
{
	public static void main(String[] args) throws 	Exception{
		FileInputStream fis=null;
		FileOutputStream  fos=null;
		try
		{
			fis=new FileInputStream("../src/FilenameFilterTest.java");
			fos=new FileOutputStream("newFile.txt");
			byte[]  bbuf=new byte[32];
			int hasRead=0;
			while((hasRead=fis.read(bbuf))>0)
			{
				//每读取一次，即写入文件输入流，读多少，去多少
				fos.write(bbuf,0,hasRead);
    		}
    	}
    	catch(IOException  ioe)
    	{
    		ioe.printStackTrace();
    	}
    	finally 
    	{
    		if (fis!=null) {
    			fis.close();
    		}
    		if (fos!=null) {
    			fos.close();
    		}
    	}
	}
}