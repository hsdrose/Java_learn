import java.util.Comparator;
import java.util.TreeSet;

class G
{
	 int age;
	 public G(int age)
	{
		 this.age=age;
	}
		 public String  toString()
		 {
			 return "G¶ÔÏó£¨age"+age+"£©";
		 }
}
public class TestTreeSet3
{

	public static void main(String[] args)
	{
		TreeSet ts=new TreeSet(new Comparator()
		{
			public int compare(Object o1, Object o2)
			{
				G m1=(G)o1;
				G m2=(G)o2;
				if (m1.age>m2.age)
				{
					return -1;
				}
				else if (m1.age==m2.age) {
				return 0;	
				}
				else
				{
					return 1;
				}
			}
		});
      ts.add(new G(5));
      ts.add(new G(-3));
      ts.add(new G(9));
      System.out.println(ts);
	}

}
