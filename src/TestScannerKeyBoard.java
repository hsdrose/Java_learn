import java.util.*;
public  class TestScannerKeyBoard 
{
	 public static void main(String[] args) {
	 	//system,in代表键盘输入
	 	Scanner sc = new Scanner(System.in);
         //增加下面一行将只把回车作为分隔符
         //sc.useDelimiter("\n");
         //判断是否还有下一输入项
         while(sc.hasNext())
         {
         	//输出输入项
         	System.out.println("键盘输入的内容"+sc.next());
         }
	 }
	}