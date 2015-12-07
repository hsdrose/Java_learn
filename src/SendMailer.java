import java.awt.*;
import java.awt.event.*;
public class SendMailer
{
	private Frame f=new Frame("test");
	private TextField tf=new TextField(40);
	private Button send=new Button("发送");
	public void init()
	{
		//使用MailerListener对象作为事件监听器
		send.addActionListener(new MailerListener(tf));
		f.add(tf);
		f.add(send, BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new SendMailer().init();
	}
}
