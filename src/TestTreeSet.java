import java.util.TreeSet;

class Z  implements Comparable
{
	int age;
	public Z(int age)
	{
		this.age=age;
	}
	public boolean equals (Object obj)
	{
		return false;
	}
	public int  compareTo(Object  obj)
	{
	    return 1;	
	}
}
public class TestTreeSet
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
  TreeSet set=new TreeSet();
  Z z1=new Z(6);
  set.add(z1);
  System.out.println(set.add(z1));
  //�鿴set���м���Ԫ��
  System.out.println(set.size());
  //�޸�set���ϵĵ�һ��Ԫ�ص�age����
  ((Z)(set.first())).age=9;
  System.out.println(((Z)(set.last())).age);
	}

}
