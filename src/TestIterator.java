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
		//��ȡbooks���϶�Ӧ�ĵ�����
		Iterator it=books.iterator();
        while (it.hasNext())
		{
        	//it.next()�������ص�����������Object���ͣ���Ҫǿ������ת��
			String book=(String)it.next();
			
			System.out.println(book);
			 
        if (books.equals("Struts"))
		{
        	//�Ӽ�����ɾ����һ��next�������ص�Ԫ��
			it.remove();
		}
//        String  book="�����ַ���";  
	  }
        System.out.println(books);
	}
}
