import java.util.*;
import java.sql.*;
import java.io.*;
class ExecuteSQL 
{
	private  String driver;
	private  String url;
	private  String user;
	private  String pass;
	Connection conn;
	Statement stmt;
	ResultSet rs;
	public void initParam(String paramFile) throws Exception
	{
		Properties props=new Properties();
		props.load(new FileInputStream(paramFile));
		driver=props.getProperty("driver");
		url=props.getProperty("url");
		user=props.getProperty("user");
		pass=props.getProperty("pass");
	}
	public void executeSql(String sql) throws Exception
	{
		try
		{
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,pass);
			stmt=conn.createStatement();
			boolean hasResultSet=stmt.execute(sql);
			if (hasResultSet) {
				//获取结果集
				rs=stmt.getResultSet();
				//ResultSetMetaData是用于分析结果集的元数据接口
				ResultSetMetaData rsmd=rs.getMetaData();
				int columnCount=rsmd.getColumnCount();
				//迭代输出ResultSet对象
				while (rs.next()) {
					//依次输出每列的值
					for(int i=0;i<columnCount;i++)
					{
						System.out.println(rs.getString(i+1)+"\t");
					}
					System.out.println("\n");
				}
				
			}
			else {
					System.out.println("该SQL语句影响的记录有"+stmt.getUpdateCount()+"条");
			}
		}
		finally
		{
			if (rs != null)
			{
				rs.close();
			}
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
	public static void main(String[] args) throws Exception{
		ExecuteSQL es = new ExecuteSQL();
		es.initParam("mysql.ini");
		System.out.println("------删除表的DDL语句-----");
		es.executeSql("drop table if exists test");
		System.out.println("------建表-----");
		es.executeSql("create table test"
			+ "(test_id int auto_increment primary key, "
			+ "test_name varchar(255))");
		System.out.println("------插入-----");
		es.executeSql("insert into test(test_name) "
			+ "select teacher_name from teacher_table");
		System.out.println("------查询表-----");
		es.executeSql("select * from test");
		}	
}