import java.util.TreeSet;

class L implements Comparable
{
	int count;
	public L(int count)
	{
		this.count=count;
	}
	public String toString()
	{
		return "L(countÊôĞÔ£º"+count+")" ;
	}
	public boolean equals(Object obj)
	{
		if (obj instanceof L)
		{
			L r=(L)obj;
			if(r.count==this.count)
			{
				return true;
			}
		}
		return false;
	}
	public int compareTo(Object obj)
	{
		L r=(L)obj;
		if (this.count>r.count)
		{
			return 1;
		}
		else if (this.count==r.count) {
			return 0;
		}
		else
		{
			return -1;
		}
	}
}
public class TestTreeSet2
{

	public static void main(String[] args)
	{
		TreeSet ts=new TreeSet();
		ts.add(new L(5));
		ts.add(new L(-3));
		ts.add(new L(9));
		ts.add(new L(-2));
       System.out.println(ts);
       L first=(L)ts.first();
       first.count=20;
      L last=(L)ts.last();
       last.count=-2;
       System.out.println(ts);
       ts.remove(new L(-2));
       System.out.println(ts);
       ts.remove(new L(5));
       System.out.println(ts);
	}

}
