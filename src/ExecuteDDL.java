import java.util.*;
import java.sql.*;
import java.io.*;
class ExecuteDDL 
{
	private  String driver;
	private	 String url;
	private  String user;
	private  String pass;
	Connection  conn;
	Statement stmt;
	public void initParam(String paraFile)  throws Exception
	{
		//使用Properties类来加载属性类
		Properties  props=new Properties();
		props.load(new FileInputStream(paraFile));
		driver=props.getProperty("driver");
		url=props.getProperty("url");
		user=props.getProperty("user");
		pass=props.getProperty("pass");

	}
	public void createTable(String sql) throws Exception
	{
		try{
			//加载驱动
			Class.forName(driver);
			//获取数据连接
			conn=DriverManager.getConnection(url,user,pass);
			stmt=conn.createStatement();
			//执行DDL，创建数据表
			stmt.executeUpdate(sql);
		}
		//使用finally块来关闭数据资源
		finally 
		{
			if (stmt!=null) {
				stmt.close();
			}
			if (conn!=null) {
				conn.close();
			}
		}
	}
	public static void main(String[] args)throws Exception {
		ExecuteDDL ed=new ExecuteDDL();
		ed.initParam("mysql.ini");
		ed.createTable("create table jdbc_test "
			+ "( jdbc_id int auto_increment primary key, " 
			+ "jdbc_name varchar(255), "
			+ "jdbc_desc text);");
	  	System.out.println("---------建表成功---------");
	}
	
}