import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

public class TestPhantomReference
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      //����һ��string ����
		String str=new String("struts");
		//����һ�����ö���
        ReferenceQueue rq=new ReferenceQueue();
        //����һ�������ã��ô����������õ���struts���ַ���
        PhantomReference  pr=new PhantomReference(str, rq);
        //�ж�����
        str=null;
        //ȡ�������õĶ���,����ͨ�������÷��ʶ���
        System.out.println(pr.get());
        //ǿ����������
        System.gc();
        System.runFinalization();
        //ȡ�����ö��������Ƚ������е�������pr���бȽ�
        System.out.println(rq.poll()==pr);    
	}

}
