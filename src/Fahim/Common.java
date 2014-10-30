package Fahim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Common {
	String table;
	ArrayList fields = new ArrayList();
	ArrayList type = new ArrayList();
	ArrayList values = new ArrayList();

	public Connection DBconnection(Connection conn) {

		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "user";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password1 = "";
		try {
			// mysql load driver
			Class.forName(driver).newInstance();

			conn = DriverManager.getConnection(url + dbName, userName,
					password1);
			System.out.println("Connected to the database");

		} 
		catch (Exception e) {
			e.printStackTrace();
			System.out.print("failed\n");
		}
		return conn;
	}

	public String add(String table, ArrayList fields, ArrayList type,
			ArrayList values) throws SQLException 
	{
		Connection conn = null;
		conn = DBconnection(conn);
		String sql = "insert into " + table + "(";

		for (int i = 0; i < fields.size(); i++) 
		{
			sql += fields.get(i);
			if (i < fields.size() - 1) 
			{
				sql += ",";
			}
		}
		sql += ") values(";

		for (int i = 0; i < fields.size(); i++) 
		{
			sql += "?";
			if (i < fields.size() - 1)
			{
				sql += ",";
			}
		}
		sql += ")";
		
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
	
		for (int i = 0; i < fields.size(); i++)
		{
			if (type.get(i).equals("String")) 
			{
				String result = (String) values.get(i);
				preparedStatement.setString(i + 1, result);
			}
			if (type.get(i).equals("int")) 
			{
				int result = (int) values.get(i);
				preparedStatement.setInt(i + 1, result);
			}
		}

		preparedStatement.executeUpdate();

		conn.close();
		
		return "success";
	}
	public String update(String table, ArrayList fields, ArrayList type,
			ArrayList values) throws SQLException 
	{
		Connection conn = null;
		conn = DBconnection(conn);
		String sql = "update " + table + " set ";

		for (int i = 0; i < fields.size(); i++) 
		{
			sql += fields.get(i)+"=? ";
			if (i < fields.size() - 1) 
			{
				sql += ",";
			}
		}
		sql += "where id=?";
		System.out.println(sql);
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
	
		for (int i = 0; i < fields.size(); i++)
		{
			if (type.get(i).equals("String")) 
			{
				String result = (String) values.get(i);
				preparedStatement.setString(i + 1, result);
			}
			if (type.get(i).equals("int")) 
			{
				int result = (int) values.get(i);
				preparedStatement.setInt(i + 1, result);
			}
		}
		preparedStatement.setInt(fields.size()+1, 3);
		preparedStatement.executeUpdate();

		conn.close();
		return "success";
	}
	public String delete(String table, int id) throws SQLException 
	{
		Connection conn = null;
		conn = DBconnection(conn);
		String sql = "delete from " + table+" where id=?";
		
		System.out.println(sql);
		
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		
		preparedStatement.setInt(1 , 3);
		preparedStatement.executeUpdate();

		conn.close();
		return "success";
	}
}
