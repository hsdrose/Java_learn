import java.awt.*;
import java.awt.event.*;
public class TestWindowAdapter
{
	private Frame f=new Frame("test");
	private TextArea ta=new TextArea(6,40);
	public  void init()
	{
		f.addWindowListener(new MyListener());
		f.add(ta);
		f.pack();
		f.setVisible(true);
	}
	class MyListener extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			ta.append("用户试图关闭窗口！\n");
			System.exit(0);
		}
	}
	public static void main(String[] args)
	{
		new TestWindowAdapter().init();
	}
}
