
public enum BetterGender implements GenderDesc
{

	  MALE("��")
	  {
		  public void info()
		  {
			  System.out.println("���ö��ֵ�����е�");
		  }
	  },
	  FEMALE("Ů")
	  {
		  public void info()
		  {
			  System.out.println("���ö��ֵ����Ů��");
		  }
	  };
	  private String name;
	   private  BetterGender(String name)
	   {
		   this.name=name;
	   }
	   public String getName()
	{
		return this.name;
	}
}
