import java.awt.*;
import javax.swing.*;
public class TestCardLayout
{
	Frame f=new Frame("test");
	String []  names={"first","second","third","forth","fifth"};
	Panel pl=new Panel();
	CardLayout c=CardLayout();
	public void init()
	{
		pl.setLayout(c);
		for(int i=0;i<names.length;i++)
		{
			pl.add(names[i],new Button(names[i]));
		}
		Panel p=new Panel();
		Button previous=new Button("previous");
		previous.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent E)
					{
						c.previous(pl);
					}
				});
		Button next=new Button("next");
		next.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						c.next(pl);
					}
				});
		Button first=new Button("first");
		first.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						c.first(pl);
					}
				});
		Button last=new Button("last");
		last.ActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						c.last(pl);
					}
				});
		Button third=new Button("third");
		third.addActionListener(new addActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						c.show(pl,"third");
					}
				});
		p.add(previous);
		p.add(next);
		p.add(first);
		p.add(last);
		p.add(third);
		f.add(pl);
		f.add(p,BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new TestCardLayout().init();
	}
}
