import java.sql.*;
import java.util.*;
import java.io.*;

public class TransactionTest
{
	private String driver;
	private String url;
	private String user;
	private String pass;
	Connection conn;
	Statement stmt;
	public void initParam(String paramFile)throws Exception
	{
		Properties props = new Properties();
		props.load(new FileInputStream(paramFile));
		driver = props.getProperty("driver");
		url = props.getProperty("url");
		user = props.getProperty("user");
		pass = props.getProperty("pass");
	}
	public void insertInTransaction(String[] sqls)throws Exception
	{
		try
		{
			Class.forName(driver);
			conn = DriverManager.getConnection(url , user , pass);
			//关闭自动提交，开启事务
			conn.setAutoCommit(false);
			//使用Connection来创建一个statement对象
			stmt = conn.createStatement();
			for (String sql : sqls)
			{
				stmt.executeUpdate(sql);
			}
			//提交事务
			conn.commit();
		}
		//舒勇finally块来关闭数据库资源
		finally
		{
			if (stmt != null)
			{
				stmt.close();
			}
			if (conn != null)
			{
				conn.close();
			}
		}
	}
	public static void main(String[] args) throws Exception
	{
		TransactionTest tt = new TransactionTest();
		tt.initParam("mysql.ini");
		String[] sqls = new String[]{
			"insert into teacher_table values(5 , 'aaa' ,1)",
			"insert into teacher_table values(6 , 'bbb' ,1)",
			"insert into teacher_table values(7 , 'ccc' ,1)",
			"insert into teacher_table values(8 , 'ccc' ,5)"
		};
		tt.insertInTransaction(sqls);
	}
}
