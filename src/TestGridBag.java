import java.awt.*;
public class TestGridBag
{
	private Frame f=new Frame("测试窗口");
	private GridBagLayout gb=new GridBagLayout();
	private GridBagConstraints gbc=new GridBagConstraints();
	private Button[]  bs=new Button[10];
	public void init()
	{
		f.setLayout(gb);
		for(int i=0;i<bs.length;i++)
		{
			bs[i]=new Button("按钮"+i);
		}
		//all components can widen on horizontal and  vertical
		gbc.fill=GridBagConstraints.BOTH;
		gbc.weightx=1;
		addButton(bs[0]);
		addButton(bs[1]);
		addButton(bs[2]);
		//该GridBagConstaints控制的GUI组件将会成为横向最后一个元素
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		addButton(bs[3]);
		//该GridBagConstaints控制的GUI组件将会跨越两个网格
		gbc.weightx=2;
		addButton(bs[4]);
		gbc.gridwidth=2;
		addButton(bs[5]);
		gbc.gridwidth=1;
		gbc.gridheight=2;
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		addButton(bs[6]);
		gbc.gridwidth=1;
		gbc.gridheight=2;
		gbc.weighty=1;
		addButton(bs[7]);
		gbc.weighty=0;
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		gbc.gridheight=1;
		addButton(bs[8]);
		addButton(bs[9]);
		f.pack();
		f.setVisible(true);
	}
	private void addButton(Button button)
	{
		gb.setConstraints(button,gbc);
		f.add(button);

	}
	public static void main(String[] args)
	{
		new  TestGridBag().init();
	}
}
