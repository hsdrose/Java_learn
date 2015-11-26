import java.awt.*;

import javax.swing.BoxLayout;
public class TestBoxLayout {
	private Frame frame=new Frame("测试");
	public void init()
	{
		frame.setLayout(new BoxLayout(frame, BoxLayout.Y_AXIS));
		frame.add(new Button("first"));
		frame.add(new Button("Second"));
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new TestBoxLayout().init();
	}

}
