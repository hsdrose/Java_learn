
public class TestGender
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//ͨ��Enum��valueOf������ȡָ��ö�����ö��ֵ
     Gender g=Enum.valueOf(Gender. class,"FEMALE");
      g.setName("Ů");
      System.out.println(g+"����"+g.getName());
      g.setName("��");
      System.out.println(g+"����"+g.getName());
	}

}
