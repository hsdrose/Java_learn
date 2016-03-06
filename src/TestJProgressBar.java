import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestJProgressBar
{
	JFrame frame = new JFrame("测试进度条");
	//创建一条垂直进度条
	JProgressBar bar = new JProgressBar(JProgressBar.VERTICAL );
	JCheckBox indeterminate = new JCheckBox("不确定进度条");
	JCheckBox noBorder = new JCheckBox("不绘制边框");
	public void init()
	{
		Box box = new Box(BoxLayout.Y_AXIS);
		box.add(indeterminate);
		box.add(noBorder);
		frame.setLayout(new FlowLayout());
		frame.add(box);
		//把进度条添加到JFrame窗口中
		frame.add(bar);
		//设置进度条的最大值和最小值
		bar.setMinimum(0); 
		bar.setMaximum(100);
		//设置在进度条中绘制完成百分比
		bar.setStringPainted(true);
		noBorder.addActionListener(new ActionListener()
		{  
			public void actionPerformed(ActionEvent event)
			{
				//根据该选择框决定是否绘制进度条的边框
				bar.setBorderPainted(!noBorder.isSelected());
			}
		});
		indeterminate.addActionListener(new ActionListener()
		{  
			public void actionPerformed(ActionEvent event)
			{
				//设置改进度条的进度是否确定
				bar.setIndeterminate(indeterminate.isSelected());
				bar.setStringPainted(!indeterminate.isSelected());
			}
		});
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		//采取循环方式来不断判断进度条的完成进度
		for (int i = 0 ; i <= 100 ; i++)
		{
			//改变进度条的完成进度
			bar.setValue(i);
			try
			{
				Thread.sleep(100);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) 
	{
		new TestJProgressBar().init();
	}
}
