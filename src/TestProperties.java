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
        //��properties����������
        props.setProperty("username", "yeeku");
        props.setProperty("passwd", "123456");
      //��properties�е����Ա��浽a.ini�ļ���    
        props.store(new FileOutputStream("a.ini"), "comment line");
        //�½�һ��properties����
        Properties props2=new Properties();
        props2.setProperty("gender", "male");
        props2.load(new FileInputStream("a.ini"));
        System.out.println(props2);
	}

}
