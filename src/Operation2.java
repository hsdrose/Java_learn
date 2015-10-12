public enum Operation2
{
   PLUS
   {
	   public double eval(double x ,double y)
	   {
		   return x+y;
	   }
   },
   MINUS
   {
	 public double eval(double x, double y)
	 {
		 return x-y;
	 }
   },
   TIMES
   {
	 public double eval(double x , double y)
	 {
		 return x*y;
	 }
   },
   DIVIDE
   {
	   public double eval(double x, double y)
	   {
		   return x/y;
	   }
   };
   //Ϊö���ඨ��һ�����󷽷���������󷽷��ɲ�ͬö��ֵ�ṩ��ͬ��ʵ��
   public abstract double  eval(double x ,double y);
   public static void main(String[] args)
{
	System.out.println(Operation2.PLUS.eval(7, 8));
	System.out.println(Operation2.MINUS.eval(9, 5));
	System.out.println(Operation2.TIMES.eval(5, 6));
	System.out.println(Operation2.DIVIDE.eval(9, 3));
}
}
