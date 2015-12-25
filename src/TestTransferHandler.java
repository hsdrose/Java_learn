import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.*;
import java.awt.dnd.*;
import javax.swing.*;
public class TestTransferHandler
{
	private JFrame jf=new  JFrame("test  TransferaHandler");
	JColorChooser chooser=new JColorChooser();
	JTextArea txt=new JTextArea("test TransferaHandler\n"+"直接将上面颜色拖入以改变文本颜色");
	public void init()
	{
		//启动颜色选择器面板和文本域的拖放功能
		chooser.setDragEnabled(true);
		txt.setDragEnabled(true);
		jf.add(chooser,BorderLayout.SOUTH);
		//允许直接将一个Color对象拖入该JTextArea对象，并赋给他得foreground属性
		txt.setTransferHandler(new TransferHandler("foreground"));
		jf.add(new JScrollPane(txt));
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new TestTransferHandler().init();
	}

}
