import java.awt.*;
public class TestBorderLayout
{
	public static void main(String[] args)
	{
		Frame f=new Frame("test");
		//setting Frame container  to  use BorderLayout  control
		f.setLayout(new BorderLayout(30,5));
		f.add(new Button("南"),BorderLayout.SOUTH);
		f.add(new Button("北"),BorderLayout.NORTH);
		f.add(new Button("中"));
		f.add(new Button("东"),BorderLayout.EAST);
		f.add(new Button("西"),BorderLayout.WEST);
		f.pack();
		f.setVisible(true);
	}
}
