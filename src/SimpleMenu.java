import java.awt.*;
import java.awt.event.*;
public class SimpleMenu
{
	private Frame f=new Frame("test");
	private MenuBar mb=new MenuBar();
	Menu  file=new Menu("文件");
	Menu  edit=new  Menu("编辑");
	MenuItem  newItem=new MenuItem("新建");
	MenuItem  saveItem=new MenuItem("保存");
	//创建exitItem菜单项，指定使用Ctrl+X快捷键
	MenuItem exitItem =new MenuItem("退出",new MenuShortcut(KeyEvent.VK_X));
	CheckboxMenuItem autoWrap=new CheckboxMenuItem("自动换行");
	MenuItem  copyItem=new MenuItem("复制");
	MenuItem  pasteItem=new MenuItem("粘贴");
	Menu format=new Menu("格式");
	MenuItem commentItem=new MenuItem("注释",new MenuShortcut(KeyEvent.VK_SLASH,true));
	MenuItem cancleItem=new MenuItem("取消注释");
	private TextArea ta=new TextArea(6,40);
	public void init()
	{
		//以匿名内部类的形式创建菜单监听器
		ActionListener menuListener=new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String cmd =e.getActionCommand();
				ta.append("单机"+cmd+"菜单"+"\n");
				if(cmd.equals("退出"))
				{
					System.exit(0);
				}
			}
		};
		commentItem.addActionListener(menuListener);
		exitItem.addActionListener(menuListener);
		newItem.addActionListener(menuListener);
		//为file添加菜单项
		file.add(newItem);
		file.add(saveItem);
		file.add(exitItem);
		//为edit菜单添加菜单项
		edit.add(autoWrap);
		edit.addSeparator();
		edit.add(copyItem);
		edit.add(pasteItem);
		//为format菜单添加菜单项
		format.add(commentItem);
		format.add(cancleItem);
		//使用添加new MenuItem("-")的方式添加菜单分隔线
		edit.add(new MenuItem("-"));
		//将format菜单组合到edit菜单中
		edit.add(format);
		//将file、edit菜单添加mb菜单条中
		mb.add(file);
		mb.add(edit);
		//为f窗口设置菜单条
		f.setMenuBar(mb);
		//以匿名内部类的形式创建事件监听器
		f.addWindowListener(new WindowAdapter()
				{
				public void windowClosing(WindowEvent e)
				{
					ta.append("用户试图在关闭窗口！\n");
					System.exit(0);
				}
				});
		f.add(ta);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String []  args)
	{
		new SimpleMenu().init();
	}
}
