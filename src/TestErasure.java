import java.util.*;
class App <T  extends  Number>
{
	T  size;
	public App(){}
	public App(T size)
	{
		this.size=size;
	}
	public void SetA(T size)
	{
		this.size=size;
	}
	public T getSize()
    {
    	return this.size;
    }
}
public class TestErasure
{
	public static void main(String[] args) {
		App<Integer> a=new App<Integer>(6);
		Integer as=a.getSize();
		System.out.println(as);
		App b=a;
		Number as1=b.getSize();
		System.out.println(as1);
	}
}