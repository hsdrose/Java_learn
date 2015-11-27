import java.awt.*;
import javax.swing.Box;
public class TestBoxSpace
{
	private Frame f=new Frame("test");
	private Box horizontal=Box.createHorizontalBox();
	private Box vertical=Box.createVerticalBox();
	public void init()
	{
		horizontal.add(new Button("horizontal Button1"));
		horizontal.add(Box.createHorizontalGlue());
		horizontal.add(new Button("horizontal Button2"));
		horizontal.add(Box.createHorizontalStrut(10));
		horizontal.add(new Button("horizontal Button3"));
		vertical.add(new Button("vertical Button1"));
		vertical.add(Box.createVerticalGlue());
		vertical.add(new Button("vertical Button2"));
		vertical.add(Box.createVerticalStrut(10));
		vertical.add(new Button("vertical Button3"));
		//vertical.add(Box.createRigidArea(Dimension d));
		f.add(horizontal,BorderLayout.NORTH);
		f.add(vertical);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new TestBoxSpace().init();
	}
}
