public class TestFinalize
{
    private static TestFinalize tf=null;
    public void info()
    {
    	System.out.println("������Դ�����finalize����");
    }
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		//����TestFinalize������������ȥ��״̬
		new  TestFinalize();
		//֪ͨϵͳ������Դ����
		System.gc();
		//�ó�����ͣ����
//       Thread.sleep(2000);��
		//ǿ���������ջ��Ƶ���ȥ������finalize�ķ���
		Runtime.getRuntime().runFinalization();
//		System.runFinalization();
        tf.info();
	}
public void finalize()
{
	//��tf���õ���ͼ���յ�ȥ��
	tf=this;
}
}
