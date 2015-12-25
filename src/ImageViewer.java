import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.beans.*;
import java.util.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileView;
public class ImageViewer
{
	final int PREVIEW_SIZE = 100;
	JFrame jf = new JFrame("简单图片查看器");
	JMenuBar menuBar = new JMenuBar();
	//该标签显示图片
	JLabel label = new JLabel();
	//以当前路径为打开路径
	JFileChooser chooser = new JFileChooser(".");
	JLabel accessory = new JLabel();
	//定义文件过滤器
	ExtensionFileFilter filter = new ExtensionFileFilter();
	public void init()
	{
		//-------------------初始化JFileChooser的初始属性-----------------
		// 创建一个FileFilter
		filter.addExtension("jpg");
		filter.addExtension("jpeg");
		filter.addExtension("gif");
		filter.addExtension("png");
		filter.setDescription("图片文件(*.jpg,*.jpeg,*.gif,*.png)");
		chooser.addChoosableFileFilter(filter);
		//禁止“文件类型”下拉列表中显示“所有文件”选项
		chooser.setAcceptAllFileFilterUsed(false); 
		//为文件选择器指定自定义的FileView对象
		chooser.setFileView(new FileIconView(filter));
		//为文件选择器指定一个预览图片的附件
		chooser.setAccessory(accessory);
		//设置预览图片组件的大小和边框
		accessory.setPreferredSize(new Dimension(PREVIEW_SIZE, PREVIEW_SIZE));
		accessory.setBorder(BorderFactory.createEtchedBorder());
		//用于检测被选择文件的改变事件
		chooser.addPropertyChangeListener(new PropertyChangeListener()
		{
			public void propertyChange(PropertyChangeEvent event) 
			{
				//JFileChooser的被选择文件已经发生改变
				if (event.getPropertyName() == JFileChooser.SELECTED_FILE_CHANGED_PROPERTY)
				{
					//获取用户选择的新文件 
					File f = (File) event.getNewValue();
					if (f == null)
					{ 
						accessory.setIcon(null); 
						return; 
					}
					//将所选文件读入ImageIcon对象中
					ImageIcon icon = new ImageIcon(f.getPath());
					//调整图像大小
					if(icon.getIconWidth() > PREVIEW_SIZE)
					{	
						icon = new ImageIcon(icon.getImage()
							.getScaledInstance(PREVIEW_SIZE, -1, Image.SCALE_DEFAULT));
					}
					//改变accessory Label的图标
					accessory.setIcon(icon);
				}
			}
		});

		//----------为该窗口安装菜单------------
		JMenu menu = new JMenu("文件");
		menuBar.add(menu);
		JMenuItem openItem = new JMenuItem("打开");
		menu.add(openItem);
		//单击openItem菜单项显示打开文件的对话框
		openItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				//设置文件对话框的当前路径
				//chooser.setCurrentDirectory(new File("."));
				//显示文件对话框
				int result = chooser.showDialog(jf , "打开图片");
				//如果用户选择了APPROVE按钮，即打开，保存及其等效按钮
				if(result == JFileChooser.APPROVE_OPTION)
				{
					String name = chooser.getSelectedFile().getPath();
					//显示指定图片
					label.setIcon(new ImageIcon(name));
				}
			}
		});
		JMenuItem exitItem = new JMenuItem("Exit");
		menu.add(exitItem);
		exitItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				System.exit(0);
			}
		});
		jf.setJMenuBar(menuBar);
		//添加用于显示图片的JPanel组件
		jf.add(new JScrollPane(label));
		jf.setSize(500, 400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}

	public static void main(String[] args)
	{
		new ImageViewer().init();
	}
}

//创建FileFilter的子类，用于实现文件过滤功能
class ExtensionFileFilter extends FileFilter
{

	private String description = "";
	private ArrayList<String> extensions = new ArrayList<String>();
	//自定义方法，用于添加文件扩展名
	public void addExtension(String extension)
	{
		if (!extension.startsWith("."))
		{
			extension = "." + extension;
			extensions.add(extension.toLowerCase());
		}
	}
	//用于设置该文件过滤器的描述文本
	public void setDescription(String aDescription)
	{
		description = aDescription;
	}
	//集成FileFilter必须实现的抽象方法，返回文件过滤器的描述文本
	public String getDescription()
	{
		return description; 
	}
	//继承FileFilter类必须实现的抽象方法,判断该文件过滤是否接受该文件
	public boolean accept(File f)
	{
		//如果是该文件是路径，接受该文件
		if (f.isDirectory()) return true;
		//将文件名转为小写
		String name = f.getName().toLowerCase();
		//遍历所有可接受的扩展名
		for (String extension : extensions)
		{
			if (name.endsWith(extension)) 
			{
				return true;
			}
		}
		return false;
	}
}
//自定义一个FileView类，用于为指定类型的指定图标
class FileIconView extends FileView
{
	private FileFilter filter;
	public FileIconView(FileFilter filter)
	{
		this.filter = filter;
	}
	//如果文件不是目录，并且不是接收文件类型
	public Icon getIcon(File f)
	{
		if (!f.isDirectory() && filter.accept(f))
		{
			return new ImageIcon("ico/pict.png");
		}
		else if (f.isDirectory())
		{
			//获取所有路径
			File[] fList = File.listRoots();
			for (File tmp : fList)
			{
				//如果该路径根路径
				if (tmp.equals(f))
				{
					return  new ImageIcon("ico/dsk.png");
				}
			}
			return new ImageIcon("ico/folder.png");
		}
		//使用默认图标
		else
		{
			return null;
		}
	}
}