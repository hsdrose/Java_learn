import java.awt.*;
import java.awt.event.*;
public class MailerListener implements ActionListener
{
	//TextField文本框用于输入发送邮件的地址
	private TextField mailAddress;
	public MailerListener(){}
	public MailerListener(TextField mailAddress)
	{
		this.mailAddress=mailAddress;
	}
	public void setMailAddress(TextField mailAddress)
	{
		this.mailAddress=mailAddress;
	}
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("程序向“"+mailAddress.getText()+"”发送邮件。。。");
		//发送邮件的真实实现
	}
}
