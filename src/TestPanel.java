import java.awt.*;
public class  TestPanel
{
	public static void main(String[] args)
	{
		Frame f=new Frame("测试窗口");
		//create a panel container
		Panel  p=new Panel();
		p.add(new TextField(10));
		p.add(new Button("单机我"));
		//put panel container into f windows 
		f.add(p);
		//setting width height loaction
		f.setBounds(50,50,250,200);
		//show windows
		f.setVisible(true);
	}
}
