public class TestSeason
{
    public TestSeason(Season s)
    {
    	System.out.println(s.getName()+"��������һ��"+s.getDesc()+"�ļ���");
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     new TestSeason(Season.FALL);
	}

}
