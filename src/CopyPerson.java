import java.awt.*;
import java.awt.event.*;
import java.awt.datatransfer.*;
public class CopyPerson
{
	Frame f = new Frame("复制对象");
	Button copy = new Button("复制");
	Button paste = new Button("粘贴");
	TextField name = new TextField(15);
	TextField age = new TextField(15);
	TextArea ta = new TextArea(3 , 30);
	//创建本地的剪贴板
	Clipboard clipboard = new Clipboard("cp");
	public void init()
	{
		Panel p = new Panel();
		p.add(new Label("姓名"));
		p.add(name);
		p.add(new Label("年龄"));
		p.add(age);
		f.add(p , BorderLayout.NORTH);
		f.add(ta);
		Panel bp = new Panel();
		//为复制按钮添加事件监听器
		copy.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				copyPerson();
			}
		});
		//为粘贴按钮添加事件监听器
		paste.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					readPerson();
				}
				catch (Exception ee)
				{
					ee.printStackTrace();
				}
			}
		});
		bp.add(copy);
		bp.add(paste);
		f.add(bp , BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);		

    }
	public void copyPerson()
	{
		//以name,age文本框的内容创建Person对象
		Person p = new Person(name.getText() , Integer.parseInt(age.getText()));
		//将Person对象封装成LocalSelection对象
		LocalSelection ls = new LocalSelection(p);
		clipboard.setContents(ls , null);

    }
	public void readPerson()throws Exception
	{
		//创建保存Person对象引用的DataFlavor对象
		DataFlavor peronFlavor = new DataFlavor("application/x-java-jvm-local-objectref;class=Person");
		//取出本地剪贴板的内容
		if (clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor))
		{
			Person p = (Person)clipboard.getData(peronFlavor);
			ta.setText(p.toString());
		}
	}
	public static void main(String[] args) 
	{
		new CopyPerson().init();
	}
}
class Person 
{

	private String name;
	private int age;

	public Person(){}

	public Person(String name , int age)
	{
		this.name = name;
		this.age = age;
	}

	public void setName(String name)
	{
		this.name = name;
	
    }
	public String getName()
	{
		 return this.name;
	
    }

	public void setAge(int age)
	{
		this.age = age;
	
    }
	public int getAge()
    {
		 return this.age;
	}
	public String toString()
	{
		return "Person对象[ name=" + name + " , age=" + age + " ]";
	}
}

