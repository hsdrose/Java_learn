
public class TestEnum
{
    public  void judge(Seasonn s) 
    {
    	//switch �����ı��ʽ����ö��ֵ
    	switch (s)
		{
		case SPRING:
			System.out.println("��ů����������̤��");
           break;
          case SUNMMER:
        	  System.out.println("�������ף��ʺ���Ӿ");
        	  break;
          case FALL:
        	  System.out.println("�����ˬ�������");
        	  break;
           case WINTER:
        	   System.out.println("����ѩ������ѩ����");
        	   break;
		}
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      //����ö���඼��һ��values���������ظ�ö���������ʵ��
		for (Seasonn s : Seasonn.values())
		{
			System.out.println(s);
		}
		//ƽ��ʹ��ö��ʵ��������ͨ��EnumClass.variable��ʽ������
		new TestEnum().judge(Seasonn.SPRING);
	}

}
