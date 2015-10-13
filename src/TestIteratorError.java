import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestIteratorError
{

	public static void main(String[] args)
	{
		Collection books=new HashSet();
		books.add("J2EE");
		books.add("Struts");
		//获取迭代器
		Iterator it=books.iterator();
		while (it.hasNext())
		{
			String book=(String)it.next();
			System.out.println(book);
			if (book.equals("Struts"))
			{
//				使用Iterator迭代过程，不可修改集合元素，下面引起异常
//				books.remove(book);
			}
			
		}
	}

}
