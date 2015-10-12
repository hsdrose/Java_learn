import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

public class TestPhantomReference
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      //创建一个string 对象
		String str=new String("struts");
		//创建一个引用队列
        ReferenceQueue rq=new ReferenceQueue();
        //创建一个虚引用，让此虚引用引用到“struts”字符串
        PhantomReference  pr=new PhantomReference(str, rq);
        //切断引用
        str=null;
        //取出虚引用的对象,不能通过虚引用访问对象
        System.out.println(pr.get());
        //强制垃圾回收
        System.gc();
        System.runFinalization();
        //取出引用队列中最先进队列中的引用于pr进行比较
        System.out.println(rq.poll()==pr);    
	}

}
