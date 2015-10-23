import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class TestProperties
{

	public static void main(String[] args) throws Exception
	{
        Properties props=new Properties();
        //向properties中增加属性
        props.setProperty("username", "yeeku");
        props.setProperty("passwd", "123456");
      //将properties中的属性保存到a.ini文件中    
        props.store(new FileOutputStream("a.ini"), "comment line");
        //新建一个properties对象
        Properties props2=new Properties();
        props2.setProperty("gender", "male");
        props2.load(new FileInputStream("a.ini"));
        System.out.println(props2);
	}

}
