import java.lang.*;
import java.math.BigDecimal;
import java.util.*;
public class TestDouble {

	public static void main(String[] args) {
		BigDecimal f1=new BigDecimal("0.05");
//		BigDecimal f2=new BigDecimal.valueOf(0.01);
		BigDecimal f3=new BigDecimal(0.01);
		System.out.println("下面使用String作为BigDecimal构造器参数的计算结果：");
		System.out.println("0.05+0.01="+f1.add(f3));
		System.out.println("0.05-0.01="+f1.subtract(f3));
		System.out.println("0.05*0.01="+f1.multiply(f3));
		System.out.println("0.05/0.01="+f1.divide(f3));
	}

}
