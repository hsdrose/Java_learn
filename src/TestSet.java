import java.util.HashSet;
import java.util.Set;

public class TestSet
{
    
	public static void main(String[] args)
	{
		Set books=new HashSet();
		books.add(new String("struts"));
		boolean result=books.add(new String("struts"));
		System.out.println(books);
	}
   
}
