import java.util.HashSet;


class M
{
	public boolean equals(Object obj)
	{
		return true;
	}
}
class B
{
	public int hashCode()
	{
		return 1;
		}
}
class C
{
	public int hashCode()
	{
		return 2;
	}
	public boolean  equals(Object obj)
	{
		return true;
	}
}
public class TestHashSet
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
    HashSet  book=new HashSet();
    book.add(new M());
    book.add(new M());
    book.add(new B());
    book.add(new B());
    book.add(new C());
    book.add(new C());
    System.out.println(book);
	}

}
