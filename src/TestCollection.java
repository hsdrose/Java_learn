import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestCollection
{

	public static void main(String[] args)
	{
		 Collection c=new ArrayList();
		 c.add("孙悟空");
		 c.add(6);
		 System.out.println("c集合的元素个数为"+c.size());
		 c.remove(6);
		 System.out.println("c集合的元素个数为"+c.size());
		 System.out.println("c的集合是否包括孙悟空"+c.contains("孙悟空"));
         c.add("J2EE");
         System.out.println("c集合的元素:"+c);
         Collection  books=new HashSet();
         books.add("J2EE");
         books.add("Struts");
         System.out.println("c集合是否完全包含books集合？"+c.contains(books));
         c.removeAll(books);
         System.out.println("c的集合的元素:"+c);
         c.clear();
         System.out.println("c的集合的元素:"+c);
         books.retainAll(c);
         System.out.println("books集合的元素："+books);
         }

}
