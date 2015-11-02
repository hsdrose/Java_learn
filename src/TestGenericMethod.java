import  java.util.*;
public class TestGenericMethod
{
   static <T>  void  fromArrayToCollection(T []  a, Collection<T> c)
   {
	    for (T	o 	: a)
		{
			c.add(o);
		}
   }
	public static void main(String[] args)
	{
    Object[]  oa=new  Object[100];
    Collection<Object>   co=new  ArrayList<Object>();
    //T代表Object类
    fromArrayToCollection(oa, co);
   String[]  str=new String[100];
    Collection<String>  strr=new ArrayList<String>();
    //代表String
    fromArrayToCollection(str, strr);
    Integer[]  in=new  Integer[100];
   Float[]  fl=new Float[100];
   Number[]  nu=new  Number[100];
   Collection<Number>   cnu=new 	ArrayList<Number>();
   fromArrayToCollection(in, cnu);
   fromArrayToCollection(fl, cnu);
   fromArrayToCollection(nu, cnu);
	}

}
