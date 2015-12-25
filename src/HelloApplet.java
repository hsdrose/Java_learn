import java.awt.*;
import java.applet.*;
import javax.swing.*;
public class HelloApplet extends JApplet
{
	//初始化Applet的方法
	public void init()
	{
		setLayout(new FlowLayout());
		add(new JButton("XXX"));
		add(new JButton("YYY"));
	}
	public void start()
	{
		System.out.println("start 方法");
	}
	//绘制Applet界面方法
	public void paint(Graphics g)
	{
		super.paint(g);
		System.out.println("paint 方法");
		g.drawLine(3,3,200,300);
	}
	//终止Applet的方法
	public void stop()
	{
		System.out.println("stop 方法");
	}
	public void destroy()
	{
		System.out.println("destroy 方法");
	}
	public static void main(String[] args)
	{
		JFrame jf=new JFrame();
		//显示调用Applet的对象
		JApplet panel=new HelloApplet();
		panel.setPreferredSize(new Dimension(300,400));
		//显示调用HelloApplet对象的init\start 方法
		panel.init();
		panel.start();
		//将HelloApplet对象添加到顶级容器中
		jf.add(panel);
		jf.pack();
		jf.setVisible(true);
	}
}
