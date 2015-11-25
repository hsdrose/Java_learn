import java.awt.*;
public class TestScrollPane
{
	public static void main(String [] args)
	{
	Frame f=new Frame("测试窗口");
	//create a ScrollPane container  always scrollbars
	ScrollPane sp=new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
	//add two component into ScrollPane container 
	sp.add(new TextField(15));
	sp.add(new Button("单机我"));
	f.add(sp);
	f.setBounds(30,30,250,200);
	f.setVisible(true);
	}
}
