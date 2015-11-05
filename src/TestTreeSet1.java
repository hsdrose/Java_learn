import java.util.*;
public class TestTreeSet1 {

	public static void main(String[] args) {
		TreeSet<String> ts1 = new TreeSet<String>(new Comparator<Object>() {
			public int compare(Object fst, Object snd) {
				return fst.hashCode() - snd.hashCode();
			}
		});
		ts1.add("hello");
		ts1.add("wa");
		TreeSet<String> ts2 = new TreeSet<String>(new Comparator<Object>() {
			public int compare(Object fst, Object snd) {
				return (snd.hashCode() - fst.hashCode());
			}
		});
		ts2.add("hello");
		ts2.add("wa");
		System.out.println(ts1);
		System.out.println(ts2);
	}

}
