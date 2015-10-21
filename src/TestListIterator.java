import java.util.*;
public class TestListIterator
{

	public static void main(String[] args)
	{
		String [] books={"Struts","J2EE"};
		List booklist=new ArrayList();
		for (int i = 0; i < books.length; i++)
		{
			booklist.add(books[i]);
		}
		ListIterator  lit=booklist.listIterator();
		while (lit.hasNext())
		{
			System.out.println(lit.next());
			lit.add("---------------分隔符-------------");
		}
		System.out.println("--------------开始反向迭代-------------");
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
	}

}
