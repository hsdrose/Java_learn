import java.util.LinkedHashMap;


public class TestLinkedHashMap
{

	public static void main(String[] args)
	{
	 LinkedHashMap  scores=new LinkedHashMap();
     scores.put("语文", 80);
     scores.put("数学", 76);
     scores.put("英文", 76);
     for (Object key : scores.keySet())
	{
		System.out.println(key+"----->");
		System.out.println(scores.get(key)+"\n");
	}
	}

}
