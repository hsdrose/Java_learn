import java.util.Hashtable;


class F
{
	 int count;
	 public F(int count)
	{
	  this.count=count;
	}
	 public boolean equals(Object obj)
	 {
		 if (obj==this)
		{
			return true;
		}
		if (obj!=null&&
			obj.getClass()==F.class)
		{
			F  a=(F)obj;
			if (this.count==a.count)
			{
				return true;
			}
		} 
		return false;
	 }
	 public int  hashcode()
	{
	  return this.count;	
	}
}
class E
{
   @Override
public boolean equals(Object obj)
{
	// TODO Auto-generated method stub
	return true;
}
}
public class TestHashtable
{

	public static void main(String[] args)
	{
		Hashtable  ht=new Hashtable();
		ht.put(new F(60000), "Struts2");
		ht.put(new F(8456), "J2EE");
		ht.put(new F(1232	), new E());
		System.out.println(ht);
         System.out.println(ht.containsKey("²âÊÔ×Ö·û´®"));
         System.out.println(ht.containsKey(new F(8456)));
         ht.remove(new F(1232));
         for (Object key : ht.keySet())
		{
			System.out.println(key+"---->");
			System.out.println(ht.get(key)+"\n");
		}
	}

}
