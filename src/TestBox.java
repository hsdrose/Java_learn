import java.awt.*;
import javax.swing.Box;
public class TestBox
{
	private Frame f=new Frame("test");
	//define a horizontalBox object
	private Box horizontal=Box.createHorizontalBox();
	private Box vertical=Box.createVerticalBox();
	public void init()
	{
		horizontal.add(new Button("horizontal Button1"));
		horizontal.add(new Button("horizontal Button2"));
		vertical.add(new Button("vertical Button1"));
		vertical.add(new Button("vertical Button2"));
		f.add(horizontal,BorderLayout.NORTH);
		f.add(vertical);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new TestBox().init();
	}
}
