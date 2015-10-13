import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestIterator
{
   
	public static void main(String[] args)
	{
		Collection books=new HashSet();
		books.add("J2EE");
		books.add("Struts");
		books.add("Ajax");
		//获取books集合对应的迭代器
		Iterator it=books.iterator();
        while (it.hasNext())
		{
        	//it.next()方法返回的数据类型是Object类型，需要强制类型转换
			String book=(String)it.next();
			
			System.out.println(book);
			 
        if (books.equals("Struts"))
		{
        	//从集合中删除上一次next方法返回的元素
			it.remove();
		}
//        String  book="测试字符串";  
	  }
        System.out.println(books);
	}
}
