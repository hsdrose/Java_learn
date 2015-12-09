import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.awt.image.BufferedImage;
public class HandDraw
{
	//画图区的宽度 高度
	private final int AREA_WIDTH=500;
	private final int AREA_HEIGHT=400;
	//下面的preX、preY保存了上一次鼠标拖动事件的鼠标坐标
	private int preX=-1;
	private int preY=-1;
	//定义一个邮件菜单哟关于设置画笔颜色
	PopupMenu pop=new PopupMenu();
	MenuItem redItem=new MenuItem("红色");
	MenuItem greenItem=new MenuItem("绿色");
	MenuItem buleItem=new MenuItem("蓝色");
	//定义一个BufferedImage对象
	BufferedImage  image=new BufferedImage(AREA_WIDTH,AREA_HEIGHT,BufferedImage.TYPE_INT_RGB);
	//获取image对象的Graphics
	Graphics g=image.getGraphics();
	private Frame f=new Frame("simple draw programmer");
	private DrawCanvas drawArea=new DrawCanvas();
	private String shape="";
	//用于保存画笔的颜色
	private Color foreColor=new Color(255,0,0);
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
				if (e.getActionCommand().equals("bule"))
				{
					foreColor = new Color(0 , 0 , 255);
				}
			}
		};
		redItem.addActionListener(menuListener);
		greenItem.addActionListener(menuListener);
		buleItem.addActionListener(menuListener);
		pop.add(redItem);
		pop.add(buleItem);
		pop.add(greenItem);
		drawArea.add(pop);
		g.fillRect(0,0,AREA_WIDTH,AREA_HEIGHT);
		drawArea.setPreferredSize(new Dimension(AREA_WIDTH,AREA_HEIGHT));
		//监听手表移动动作
		drawArea.addMouseMotionListener(new MouseMotionAdapter()
				{
					public void mouseDragged(MouseEvent e)
					{
						if(preX >0&&preY>0)
						{
							//设置当前颜色
							g.setColor(foreColor);
							//绘制从上一次鼠标拖动事件点到本次鼠标拖动事件点的线段
							g.drawLine(preX,preY,e.getX(),e.getY());
						}
						preX=e.getX();
						preY=e.getY();
						//绘制drawArea对象
						drawArea.repaint();
					}
				});
		drawArea.addMouseListener(new MouseAdapter()
				{
					public void mouseReleased(MouseEvent e)
					{
						if(e.isPopupTrigger())
						{
							pop.show(drawArea,e.getX(),e.getY());
						}
					preX=-1;
					preY=-1;
					}
				});
		f.add(drawArea);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new HandDraw().init();
	}
	class DrawCanvas extends Canvas
	{
		//重写Canvas的paint方法，实现绘图
		public void paint(Graphics g)
		{
			g.drawImage(image,0,0,null);
		}
	}
}
