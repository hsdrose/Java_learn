import java.lang.*;
import java.util.*;
public class  TestSeed
{
	public static void main(String[] args)
	{
		Random r1=new Random(50);
		System.out.println("第一个种子为50的Random对象");
		System.out.println("r1.nextBoolean():\t"+r1.nextBoolean());
		System.out.println("r1.nextInt():\t\t"+r1.nextInt());
		
	}
}
