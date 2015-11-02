import java.util.*;

public class Test
{
	static <T> void test(Collection<? extends T> a, Collection<T> b)
	{
		for (T o : a)
		{
			b.add(o);
		}
	}
	public static void main(String[] args)
	{
		List<Object>  aList=new  ArrayList<Object>();
		List<String>   sList=new  ArrayList<String>();
		test(sList, aList);
	}

}
