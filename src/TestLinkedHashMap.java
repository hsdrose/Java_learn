import java.util.LinkedHashMap;


public class TestLinkedHashMap
{

	public static void main(String[] args)
	{
	 LinkedHashMap  scores=new LinkedHashMap();
     scores.put("����", 80);
     scores.put("��ѧ", 76);
     scores.put("Ӣ��", 76);
     for (Object key : scores.keySet())
	{
		System.out.println(key+"----->");
		System.out.println(scores.get(key)+"\n");
	}
	}

}
