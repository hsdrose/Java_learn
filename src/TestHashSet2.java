import java.util.HashSet;
import java.util.Iterator;

class R
{
	 int count;
	 public R(int count)
	{
		// TODO Auto-generated constructor stub
		 this.count=count;
	}
	 public String  toString()
	 {
		 return "R(count���ԣ�"+count+")";
	 }
	 public boolean equals(Object obj)
	 {
		 if (obj  instanceof R)
		{
			R r=(R)obj;
			if (r.count==this.count)
			{
				return true;
			}
		}
		return false;
	 }
	 public int  hashCode()
	 {
		 return this.count;
	 }
}
public class TestHashSet2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
    HashSet  hs = new HashSet();
    hs.add(new R(5));
    hs.add(new R(-3));
    hs.add(new R(9));
    hs.add(new R(-2));
    System.out.println(hs);
    Iterator it=hs.iterator();
    R first=(R)it.next();
    first.count=-3;
    System.out.println(hs);
    hs.remove(new R(-3));
    System.out.println(hs);
    System.out.println("hs�Ƿ����countΪ-3��R���� "+ hs.contains(new R(-3)));
    System.out.println("hs�Ƿ����countΪ5��R����?"+hs.contains(new R(-2)));
	}

}
