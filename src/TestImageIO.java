import  javax.imageio.*;
public class TestImageIO
{
	public static void main(String[] args)
	{
		String[] readFormat=ImageIO.getReaderFormatNames();
		System.out.println("------Image能读的所有图形文件格式------");
		for(String tmp : readFormat)
		{
			System.out.printf(tmp+"\t");
		}
		String[] writerFormat=ImageIO.getWriterFormatNames();
		System.out.println("-----Image能写的所有图形文件格式-------");
		for(String tmp : writerFormat)
		{
			System.out.printf(tmp+"\t");
		}
	}
}
