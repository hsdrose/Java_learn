import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.datatransfer.*;
public class SimpleClipboard
{
	private Frame f = new Frame("简单的剪贴板");
	//获取系统剪贴板
	private Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); 
	//创建本地剪贴板
	//Clipboard clipboard = new Clipboard("cb"); 
	//用于复制文本的文本框
	private TextArea jtaCopyTo = new TextArea(5,20); 
	//用于粘贴的文本框
	private TextArea jtaPaste = new TextArea(5,20);
	private Button btCopy = new Button("copy"); //复制按钮
	private Button btPaste = new Button("paste"); //粘贴按钮 
	public void init()
	{
		Panel p = new Panel();
		p.add(btCopy);
		p.add(btPaste);  
		btCopy.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				//将一个多行文本域里的字符串封装成StringSelection对象
				StringSelection contents=new StringSelection(jtaCopyTo.getText());
				//将StringSelection对象放入剪贴板
				clipboard.setContents(contents, null); 
			}
		});
		btPaste.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				//如果剪贴板中包含stringFlavor内容
				if (clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor))
				{
					try
					{
						//取出剪贴板中stringFlavor内容
						String content = (String)clipboard.getData(DataFlavor.stringFlavor);
						jtaPaste.append(content);
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}

				}
			}
		}); 
		//创建一个水平排列的Box容器
		Box box = new Box(BoxLayout.X_AXIS);
		//将两个多行文本域放在Box容器中
		box.add(jtaCopyTo);
		box.add(jtaPaste);
		//将按钮所在的Panel、Box容器添加到Frame窗口中
		f.add(p,BorderLayout.SOUTH); 
		f.add(box,BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new SimpleClipboard().init(); 
	}
}
