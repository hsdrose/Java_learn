import java.util.*;
public  class HelloArgs
{
	public static  void  main(String[] aegs)
	{
		Locale currrentLocale=null;
		if(args.length==2)
		{
			//使用运行程序的两个参数构造locale实例
			currrentLocale=new Locale(args[0],args[1])
		}
		else
		{
			currrentLocale=Locale.getDefault();
		}
		//根据Locale加载语言资源
		ResourceBundle bundle=ResourceBundle.getBundle("MyResource",currrentLocale);
		String msg=bundle.getString("msg");
		System.out.println(MessageFormat.format(msg,"wanghongfu",new Date()));
	}
}
