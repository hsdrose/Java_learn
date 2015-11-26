import java.awt.*;
public class TestBorderLayout2
{
	public static void main(String [] args)
	{
		Frame f=new Frame("test");
		f.setLayout(new BorderLayout(30,5));
		f.add(new Button("SOUTH"),BorderLayout.SOUTH);
		f.add(new Button("NORTH"),BorderLayout.NORTH);
		Panel p=new Panel();
		p.add(new TextField(20));
		p.add(new Button("click on me"));
		f.add(p);
		f.add(new Button("EAST"),BorderLayout.EAST);
		f.pack();
		f.setVisible(true);
	}
}
