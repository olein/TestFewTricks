package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.Vector;


public class UserAction extends MySQLDatabase {
	private String name;
	private String password;
	public Vector<User> output = new Vector<User>();
	//User user = new User();
	
	public String getAllUser() throws SQLException {
		MySQLDatabase db = new MySQLDatabase();
		table = "account";
		
		ResultSet rs = db.executeSelectQuery("account", "*", fields, type, values );
		
		while(rs.next())
		{
			User user = new User();
			user.setName(rs.getString(2));
			user.setPassword(rs.getString(3));
			System.out.println(user.getName()+" "+user.getPassword());
			output.add(user);			
		}		
		System.out.println(output);
		closeConnection(db.conn); 
		
		return "success";
	}
	
	public String getAllUserByCriteria() throws SQLException {
		MySQLDatabase db = new MySQLDatabase();
		table = "account";
		if(name.length()!=0)
		{
			fields.add("email");
			type.add("String");
			values.add(name);
		}
		if(password.length()!=0)
		{	
			fields.add("password");
			type.add("String");
			values.add(password);
		}
		ResultSet rs = db.executeSelectQuery("account", "*", fields, type, values );
		
		while(rs.next())
		{
			User user = new User();
			user.setName(rs.getString("email"));
			user.setPassword(rs.getString("password"));
			System.out.println(user.getName()+" "+user.getPassword());
			output.add(user);			
		}		
		System.out.println(output);
		closeConnection(db.conn); 
		
		return "success";
	}
	
	public String add() throws SQLException
	{
		MySQLDatabase db = new MySQLDatabase();
		table = "account";
		
		fields.add("email");
		fields.add("password");
		
		type.add("String");
		type.add("String");
		
		values.add(name);
		values.add(password);
		
		String result = db.add(table, fields, type, values);
		
		return result;
	}
	
	public String update() throws SQLException
	{
		MySQLDatabase db = new MySQLDatabase();
		table = "account";
		if(name.length()!=0)
		{
			fields.add("email");
			type.add("String");
			values.add(name);
		}
		if(password.length()!=0)
		{	
			fields.add("password");
			type.add("String");
			values.add(password);
		}
		
		String result = db.update(table, fields, type, values);
		
		return result;
	}
	
	public String delete() throws SQLException
	{
		MySQLDatabase db = new MySQLDatabase();
		table = "account";
		int id = 6;		
		String result = db.delete(table, id);
		
		return result;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Vector<User> getOutput() {
		return output;
	}

	public void setOutput(Vector<User> output) {
		this.output = output;
	}
}
