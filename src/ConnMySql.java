import java.sql.*;
public class ConnMySql
{
	public static void main(String[] args) throws Exception
	{
		//1.加载驱动，使用反射的知识，
		Class.forName("com.mysql.jdbc.Driver");
		//2.使用DriverManager获取数据连接
		//其中返回的Connection就代表Java程序和数据库的连接
		//不同数据库的URL写法需要查驱动文档知道，用户名，密码
		Connection conn = DriverManager.getConnection(
			"jdbc:mysql://127.0.0.1:3306/test" ,
			"root" , "xingfu2162304");

		//3.使用Connection创建一个Statement对象
		Statement stmt = conn.createStatement();
		//4.执行SQL语句
		ResultSet rs = stmt.executeQuery("select s.* , teacher_name from teacher_table s ");
		//ResultSet有系列的getXxx(列索引| 列名)，用于获取记录指针指向、特定列的值
		//不断地使用next将记录指针下移一行，如果依然指向有效行，则指针指向行的记录
		while(rs.next())
		{
			System.out.println(rs.getInt(1) + "\t"
				+ rs.getString(2) + "\t"
				+ rs.getString(3) + "\t"
				+ rs.getString(4));
		}
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
