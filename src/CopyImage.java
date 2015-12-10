
import java.awt.image.BufferedImage;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.datatransfer.*;
public class CopyImage
{
	//系统剪贴板
	private Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); 
	//画图区的宽度 高度
	private final int AREA_WIDTH = 400;
	private final int AREA_HEIGHT = 200;
	//preX preY保存上一次鼠标拖动事件的鼠标坐标
	private int preX = -1;
	private int preY = -1;
	//定义一个邮件菜单用于设置画笔的颜色
	PopupMenu pop = new PopupMenu();
	MenuItem redItem = new MenuItem("red");
	MenuItem greenItem = new MenuItem("green");
	MenuItem blueItem = new MenuItem("blue");
	//定义一个BufferedImage对象
	BufferedImage image = new BufferedImage(AREA_WIDTH , AREA_HEIGHT , 
		BufferedImage.TYPE_INT_RGB);
	//使用ArrayList来保存所有粘贴进来的Image-就是当成图层处理
	java.util.List<Image> imageList = new java.util.ArrayList<Image>();
	//获取image对象的Graphics
	Graphics g = image.getGraphics();
	private Frame f = new Frame("Paint Programmer");
	private DrawCanvas drawArea = new DrawCanvas();
	//用于保存需要绘制什么图形的字符串属性
	private String shape = "";
	//用于保存画笔颜色
	private Color foreColor = new Color(255, 0 ,0);
	private Button copy = new Button("copy");
	private Button paste = new Button("paste");
	public void init()
	{
		//定义右键菜单的事件监听器
		ActionListener menuListener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (e.getActionCommand().equals("green"))
				{
					foreColor = new Color(0 , 255 , 0);
				}
				if (e.getActionCommand().equals("red"))
				{
					foreColor = new Color(255 , 0 , 0);
				}
				if (e.getActionCommand().equals("blue"))
				{
					foreColor = new Color(0 , 0 , 255);
				}
			}
		};
		//为三个菜单添加事件监听器
		redItem.addActionListener(menuListener);
		greenItem.addActionListener(menuListener);
		blueItem.addActionListener(menuListener);
		//将菜单项组合成右键菜单
		pop.add(redItem);
		pop.add(greenItem);
		pop.add(blueItem);
		//将右键菜单添加到drawArea对象中
		drawArea.add(pop);
		//将image对象的背景色填充成白色
		g.fillRect(0 , 0 ,AREA_WIDTH , AREA_HEIGHT);
		drawArea.setPreferredSize(new Dimension(AREA_WIDTH , AREA_HEIGHT));
		//监听鼠标移动动作
		drawArea.addMouseMotionListener(new MouseMotionAdapter()
		{
			//实现按下鼠标键并拖动的事件处理器
			public void mouseDragged(MouseEvent e)
			{
				//如果preX和preY大于0
				if (preX > 0 && preY > 0)
				{
					//设置当前颜色
					g.setColor(foreColor);
					//绘制从上一次鼠标拖动时间点到背刺鼠拖动事件点的线段
					g.drawLine(preX , preY , e.getX() , e.getY());
				}
				//将当前鼠标事件点得XY坐标保存起来
				preX = e.getX();
				preY = e.getY();
				//重绘drawArea对象
				drawArea.repaint();
			}
		});
		//监听鼠标事件
		drawArea.addMouseListener(new MouseAdapter()
		{
			//实现鼠标松开的事件处理器
			public void mouseReleased(MouseEvent e)
			{
				//弹出右键菜单
				if (e.isPopupTrigger())
				{
					pop.show(drawArea , e.getX() , e.getY());
				}
				//松开鼠标键时，把上次鼠标拖动事件的X、Y坐标设为-1
				preX = -1;
				preY = -1;
			}
		});
		f.add(drawArea);
		Panel p = new Panel();
		copy.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				//将image对象封装沉ImageSelection对象
				ImageSelection contents = new ImageSelection(image);
				//将ImageSelection对象放入剪贴板中
				clipboard.setContents(contents, null); 
			}
		});
		paste.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				//如果剪贴板中包含imageFlavor内容
				if (clipboard.isDataFlavorAvailable(DataFlavor.imageFlavor))
				{
					try
					{
						//取出剪贴板中imageFlavor内容，并将其添加List集合中
						imageList.add((Image)clipboard.getData(DataFlavor.imageFlavor));
						drawArea.repaint();
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}

				}
			}
		}); 
		p.add(copy);
		p.add(paste);
		f.add(p , BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new CopyImage().init();
	}
	class DrawCanvas extends Canvas
	{
		//重写Canvas的paint方法，实现绘图
		public void paint(Graphics g)
		{
			//将image绘制到该组件上
			g.drawImage(image , 0 , 0 , null);
			//将List里的所有Image对象都绘制出来
			System.out.println(imageList.size());
			for (Image img : imageList)
			{
				g.drawImage(img , 0 , 0 , null);
			}
		}
	}
}
