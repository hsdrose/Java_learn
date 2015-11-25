import java.awt.*;
public class TestFrame
{
	public static void main(String[] args)
	{
		Frame f=new Frame("测试窗口");
		//setting width height  location
		f.setBounds(30,30,250,200);
		//show windows
		f.setVisible(true);
	}
}

