
import java.awt.*;
import java.awt.event.*;
import java.awt.datatransfer.*;
import java.io.*;
public class CopySerializable
{
	Frame f = new Frame("copy object");
	Button copy = new Button("copy");
	Button paste = new Button("paste");
	TextField name = new TextField(15);
	TextField age = new TextField(15);
	TextArea ta = new TextArea(3 , 30);
	Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	public void init()
	{
		Panel p = new Panel();
		p.add(new Label("name "));
		p.add(name);
		p.add(new Label("age"));
		p.add(age);
		f.add(p , BorderLayout.NORTH);
		f.add(ta);
		Panel bp = new Panel();
		copy.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				copyPerson();
			}
		});
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
		Dog d = new Dog(name.getText() , Integer.parseInt(age.getText()));
		SerialSelection ls = new SerialSelection(d);
		clipboard.setContents(ls , null);
	}
	public void readPerson()throws Exception
	{
		DataFlavor peronFlavor = new DataFlavor("application/x-java-serialized-object;class=Dog");
		if (clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor))
		{
			Dog d = (Dog)clipboard.getData(peronFlavor);
			ta.setText(d.toString());
		}
	}
	public static void main(String[] args) 
	{
		new CopySerializable().init();
	}
}
class Dog implements Serializable 
{
	private String name;
	private int age;

	public Dog(){}

	public Dog(String name , int age)
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
		return "DogObject[ name=" + name + " , age=" + age + " ]";
	}
}