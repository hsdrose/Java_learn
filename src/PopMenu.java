import java.awt.*;
import java.awt.event.*;
public class PopMenu
{
	private TextArea ta=new TextArea(4,30);
	private  Frame f=new Frame("test");
	PopupMenu pop=new  PopupMenu();
	CheckboxMenuItem autoWrap=new CheckboxMenuItem("自动换行");
	MenuItem copyItem=new MenuItem("复制");
	MenuItem pasteItem=new MenuItem("粘贴");
	Menu format=new Menu("格式");
	//创建commentItem菜单项，指定使用Ctrl+shift+/  快捷键
	MenuItem commentItem=new MenuItem("注释",new MenuShortcut(KeyEvent.VK_SLASH,true));
	MenuItem cancleItem=new MenuItem("取消注释");
	public void init()
	{
		//以匿名内部类的形式创建菜单监听器
		ActionListener menuListener=new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String cmd=e.getActionCommand();
				ta.append("单机”"+cmd+"”菜单"+"\n");
				if(cmd.equals("退出"))
				{
					System.exit(0);
				}
			}
		};
		//为commentItem、exitItem两个菜单添加了时间监听器
		commentItem.addActionListener(menuListener);
		//pop菜单添加菜单项
		pop.add(autoWrap);
		//使用addSeparator方法添加菜单分割线
		pop.add(copyItem);
		pop.add(pasteItem);
		format.add(commentItem);
		format.add(cancleItem);
		pop.add(new MenuItem("-"));
		pop.add(format);
		final Panel p=new Panel();
		p.setPreferredSize(new Dimension(300,160));
		//向p窗口中添加PopupMenu对象
		p.add(pop);
		p.addMouseListener(new MouseAdapter()
		{
			public void mouseReleased(MouseEvent e)
			{
				if(e.isPopupTrigger())
				{
					pop.show(p,e.getX(),e.getY());
				}
			}
		});
		f.add(p);
		f.add(ta,BorderLayout.NORTH);
		f.addWindowListener(new WindowAdapter ()
				{
					public void windowClosing(WindowEvent e)
					{
					ta.append("试图关闭窗口！\n");
					System.exit(0);
					}
				});
		f.pack();
		f.setVisible(true);

	}
	public static void	 main(String[] args)
	{
		new PopMenu().init();
	}
}
