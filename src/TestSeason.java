public class TestSeason
{
    public TestSeason(Season s)
    {
    	System.out.println(s.getName()+"，这真是一个"+s.getDesc()+"的季节");
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     new TestSeason(Season.FALL);
	}

}
