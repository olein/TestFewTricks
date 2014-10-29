package Fahim;

import java.sql.*;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionContext;

public class CRUD {
	
	private String name;
	private String password;
	String table;
	ArrayList fields = new ArrayList();
	ArrayList type = new ArrayList();
	ArrayList values = new ArrayList();
	
	public String add() throws SQLException
	{
		Common common = new Common();
		table = "account";
		
		fields.add("email");
		fields.add("password");
		
		type.add("String");
		type.add("String");
		
		values.add(name);
		values.add(password);
		
		String result = common.add(table, fields, type, values);
		
		return "success";
	}
	
	public String update() throws SQLException
	{
		Common common = new Common();
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
		
		String result = common.update(table, fields, type, values);
		
		return "success";
	}
	public String delete() throws SQLException
	{
		Common common = new Common();
		table = "account";
		int id = 3;		
		String result = common.delete(table, id);
		
		return "success";
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


}
