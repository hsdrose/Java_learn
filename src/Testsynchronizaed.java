import java.util.*;
public class Testsynchronizaed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 下面程序创建了四个同步的集合对象
		Collection c = Collections.synchronizedCollection(new ArrayList());
		List list = Collections.synchronizedList(new ArrayList());
		Set s = Collections.synchronizedSet(new HashSet());
		Map m = Collections.synchronizedMap(new HashMap());
	}

}
