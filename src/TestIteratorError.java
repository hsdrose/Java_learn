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
		//��ȡ������
		Iterator it=books.iterator();
		while (it.hasNext())
		{
			String book=(String)it.next();
			System.out.println(book);
			if (book.equals("Struts"))
			{
//				ʹ��Iterator�������̣������޸ļ���Ԫ�أ����������쳣
//				books.remove(book);
			}
			
		}
	}

}
