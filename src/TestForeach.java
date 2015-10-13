import java.awt.print.Book;
import java.util.Collection;
import java.util.HashSet;

public class TestForeach
{

	public static void main(String[] args)
	{
		Collection books=new HashSet();
	    books.add("J2EE");
	    books.add("Struts");
	    books.add("Ajax");
    for (Object obj : books)
	{
		String book=(String)obj;
		System.out.println(book);
		if (book.equals("Struts"))
		{
//			books.remove(book);
		}
	}
    System.out.println(books);
	}

}
