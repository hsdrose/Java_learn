import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestCollection
{

	public static void main(String[] args)
	{
		 Collection c=new ArrayList();
		 c.add("�����");
		 c.add(6);
		 System.out.println("c���ϵ�Ԫ�ظ���Ϊ"+c.size());
		 c.remove(6);
		 System.out.println("c���ϵ�Ԫ�ظ���Ϊ"+c.size());
		 System.out.println("c�ļ����Ƿ���������"+c.contains("�����"));
         c.add("J2EE");
         System.out.println("c���ϵ�Ԫ��:"+c);
         Collection  books=new HashSet();
         books.add("J2EE");
         books.add("Struts");
         System.out.println("c�����Ƿ���ȫ����books���ϣ�"+c.contains(books));
         c.removeAll(books);
         System.out.println("c�ļ��ϵ�Ԫ��:"+c);
         c.clear();
         System.out.println("c�ļ��ϵ�Ԫ��:"+c);
         books.retainAll(c);
         System.out.println("books���ϵ�Ԫ�أ�"+books);
         }

}
