import java.lang.ref.WeakReference;

public class TestReference
{
	public static void main(String[] args)
	{
		//����һ���ַ�������
	  String str=new String("Struts");
	  //����һ�������ã��ô����������õ���Struts���ַ���
	  WeakReference wr=new WeakReference(str);
	  //�ж�str���ú͡�Struts���ַ���֮�������
	  str=null;
	  //ȡ�������������õĶ���
	  System.out.println(wr.get());
	  //ǿ����������
	  System.gc();
	  System.runFinalization();
	  //�ٴ�ȡ�������������õĶ���
	  System.out.println(wr.get());
	}

}
