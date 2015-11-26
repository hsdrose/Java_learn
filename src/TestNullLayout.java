import java.awt.*;
public class TestNullLayout {
	Frame frame=new Frame("test");
	Button b1=new Button("first");
	Button b2=new Button("second");
	public void  init() {
		frame.setLayout(null);
		b1.setBounds(20,30,90,28);
		b2.setBounds(50,45,120,35);
		frame.add(b1);
		frame.add(b2);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new TestNullLayout().init();
	}

}
