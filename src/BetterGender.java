
public enum BetterGender implements GenderDesc
{

	  MALE("男")
	  {
		  public void info()
		  {
			  System.out.println("这个枚举值代表男的");
		  }
	  },
	  FEMALE("女")
	  {
		  public void info()
		  {
			  System.out.println("这个枚举值代表女的");
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
