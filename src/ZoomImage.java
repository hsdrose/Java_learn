import javax.imageio.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
public class ZoomImage
{
	//定义两个常量设置缩小后图片的大小
	private final int WIDTH=80;
	private final int HEIGHT=60;
	//定义一个BufferedImage对象，用于保存缩小后的位图
	BufferedImage image=new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
	Graphics g=image.getGraphics();
	public void zoom() throws Exception
	{
		//读取原始位置
		Image srcImage=ImageIO.read(new File("../src/image/board.jpg"));
		//将原始位图缩小后绘制到image图像中
		g.drawImage(srcImage,0,0,WIDTH,HEIGHT,null);
		//将image图像文件输出写入磁盘中
		ImageIO.write(image,"jpeg",new File(System.currentTimeMillis()+".jpg"));
	}
	public static void main(String[] args) throws Exception
	{
		new ZoomImage().zoom();
	}


}
