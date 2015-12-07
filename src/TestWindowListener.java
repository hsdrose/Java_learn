import java.awt.*;
import java.awt.event.*;
public class TestWindowListener
{
	private Frame f=new Frame("test");
	private TextArea ta=new TextArea(6,40);
	public void init(){
		f.addWindowListener(new myListener());
		f.add(ta);
		f.pack();
		f.setVisible(true);
	}
	//achieve a  windowListener class
	class myListener  implements  WindowListener
	{
		public void windowActivated(WindowEvent e)
		{
			ta.append("窗口被激活！\n");
		}
		public void windowClosed(WindowEvent e)
		{
			ta.append("窗口被关闭！\n");
		}
		public void windowClosing(WindowEvent e)
		{
			ta.append("窗口正在被关闭!\n");
		}
		public  void windowDeactivated(WindowEvent e)
		{
			ta.append("窗口失去焦点!\n");
		}
		public void windowDeiconified(WindowEvent e)
		{
			ta.append("窗口被恢复");
		}
		public  void windowIconified(WindowEvent e)
		{
			ta.append("窗口被最小化!\n");
		}
		public void windowOpened(WindowEvent e)
		{
			ta.append("窗口被初次打开！\n");
		}
	}
	public static void main(String[] args)
	{
		new TestWindowListener().init();
	}
}
