import java.util.EnumMap;
enum Season1
{
	SPRING , SUMMER, FALL, WINTER
}

public class TestEnumMap {

	public static void main(String[] args) {
		EnumMap hah=new EnumMap(Season1.class);
		hah.put(Season1.SUMMER, "��������");
		hah.put(Season1.SPRING, "��ů����");
		System.out.println(hah);
		
	}

}
