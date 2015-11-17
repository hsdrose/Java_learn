import java.util.*;
import java.lang.*;
public  class TestStringBuilder
{
	StringBuilder sb=new StringBuilder();
    sb.append("java");
	System.out.println(sb);
	sb.insert(0,"hello");
	System.out.println(sb);
	sb.replace(5,6,',');
	System.out.println(sb)
	sb.delete(5,6);
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);

    
}
