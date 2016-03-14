import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
public class LoginFrame
{
	private final String PROP_FILE = "mysql.ini";

	//driver是数据库驱动类，通过查驱动文档得到
	private String driver;
	private String url;
	private String user;
	private String pass;
	//绘制登陆界面GUI
	private JFrame jf = new JFrame("登陆");
	private JTextField userField = new JTextField(20);
	private JTextField passField = new JTextField(20);
	private JButton loginButton = new JButton("登陆");
	//执行JDBC操作的对象
	private Connection conn;
	private	Statement stmt;
	private	PreparedStatement pstmt;
	private ResultSet rs;

	public void init()throws Exception
	{
		Properties connProp = new Properties();
		connProp.load(new FileInputStream(PROP_FILE));
		driver = connProp.getProperty("driver");
		url = connProp.getProperty("url");
		user = connProp.getProperty("user");
		pass = connProp.getProperty("pass");
		//为登陆按钮添加事件监听
		loginButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//登陆成功显示
				if (validate(userField.getText(), passField.getText()))
				{
					JOptionPane.showMessageDialog(jf, "登陆成功");
				}
				//失败显示
				else
				{
					JOptionPane.showMessageDialog(jf, "登陆失败");
				}
			}
		});
		jf.add(userField , BorderLayout.NORTH);
		jf.add(passField);
		jf.add(loginButton , BorderLayout.SOUTH);
		jf.pack();
		jf.setVisible(true);
	}

	// private boolean validate(String userName, String userPass)
	// {
	// 	try
	// 	{
	// 		Class.forName(driver);
	// 		conn = DriverManager.getConnection(url , user ,pass);
	// 		stmt = conn.createStatement();
	// 		String sql = "select * from test "
	// 			+ "where test_name='" + userName 
	// 			+ "' and test_id='" + userPass + "'";
	// 		System.out.println(sql);
	// 		//如果查询的ResultSet里有超过一条记录，则登陆成功
	// 		if (stmt.executeQuery(sql).next())
	// 		{
	// 			return true;
	// 		}
	// 	}
	// 	catch(Exception e)
	// 	{
	// 		e.printStackTrace();
	// 	}
	// 	finally
	// 	{
	// 		try
	// 		{
	// 			if (rs != null)
	// 			{
	// 				rs.close();
	// 			}
	// 			if (stmt != null)
	// 			{
	// 				stmt.close();
	// 			}
	// 			if (conn != null)
	// 			{
	// 				conn.close();
	// 			}				
	// 		}
	// 		catch (Exception e)
	// 		{
	// 			e.printStackTrace();
	// 		}
	// 	}
	// 	return false;
	// }

	private boolean validate(String userName, String userPass)
	{
		try
		{
			Class.forName(driver);
			conn = DriverManager.getConnection(url , user ,pass);
			pstmt = conn.prepareStatement("select * from  test "
				+ "where test_name=? and test_id=?");
			pstmt.setString(1, userName);
			pstmt.setString(2, userPass);
			//
			if (pstmt.executeQuery().next())
			{
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if (rs != null)
				{
					rs.close();
				}
				if (pstmt != null)
				{
					pstmt.close();
				}
				if (conn != null)
				{
					conn.close();
				}				
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		return false;
	}


    public static void main(String[] args) throws Exception
    {
		new LoginFrame().init();
    }
}