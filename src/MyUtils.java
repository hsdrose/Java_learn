import java.util.*;
public class MyUtils {
	public static <T> T copy(Collection<? super T> des, Collection<T> src) {
     T last=null;
     for (T ele: src)
     {
    	 last=ele;
    	 des.add(ele);
     }
     return last;
	}

	public static void main(String[] args) {
     List<Number> ln=new ArrayList<Number>();
     List<Integer>  li=new ArrayList<Integer>();
     li.add(5);
     Integer last=copy(ln, li);
     System.out.println(ln);
     System.out.println(last);
	}

}
