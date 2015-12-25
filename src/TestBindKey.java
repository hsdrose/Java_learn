import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TestBindKey
{
	JFrame jf = new JFrame("测试键盘绑定");
	JTextArea jta = new JTextArea(5, 30);
	JButton jb = new JButton("发送");
	JTextField jtf = new JTextField(15);
	public void init()
	{
		jf.add(jta);
		JPanel jp = new JPanel();
		jp.add(jtf);
		jp.add(jb);
		jf.add(jp , BorderLayout.SOUTH);
		//发送Action,Action是AbstractListener的子接口
		Action sendMsg = new AbstractAction()
		{
			public void actionPerformed(ActionEvent e)
			{
				jta.append(jtf.getText() + "\n");
				jtf.setText("");
			}
		};
		//Ìí¼ÓÊÂ¼þ¼àÌýÆ÷
		jb.addActionListener(sendMsg);
		//½«Ctrl+Enter¼üºÍ"send"¹ØÁª
		jtf.getInputMap().put(KeyStroke.getKeyStroke('\n', java.awt.event.InputEvent.CTRL_MASK) 
			, "send");
		//½«"send"ºÍsendMsg Action¹ØÁª
		jtf.getActionMap().put("send", sendMsg);
		jf.pack();
		jf.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new TestBindKey().init();
	}
}
