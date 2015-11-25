import java.awt.*;
public class TestFlowLayout
{
	public static void main(String[] args)
	{
		Frame f=new Frame("test");
		//setting layoutmanage tool of frame container
		f.setLayout(new FlowLayout(FlowLayout.LEFT,30,10));
		//add 10 buttons
		for(int i=0;i<20;i++)
		{
			f.add(new Button("button"+i));
		}
		//setting suitble windows 
		f.pack();
		f.setVisible(true);
	}
}
