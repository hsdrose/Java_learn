import java.util.*;
public class TestEnumeration {

	public static void main(String[] args) {
    Vector v=new Vector();
    v.add("Struts 权威指南");
    v.add("轻量级J2EE企业应用实战");
    Hashtable scores=new Hashtable();
    scores.put("Chinese", 78);
    scores.put("Math", 89);
    Enumeration  em=v.elements();
    while (em.hasMoreElements()) {
       System.out.println(em.nextElement());		
	}
    Enumeration keyem=scores.keys();
    while (keyem.hasMoreElements()) {
		Object key = keyem.nextElement();
		System.out.println(key+"------>");
		System.out.println(scores.get(key)+"\n");
		
	}
	}

}
