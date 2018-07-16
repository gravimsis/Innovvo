package com.org.LearningMaven;


import java.sql.*;

public class JdbcConnection {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/";
		String databaseName = "mylocal";
		String username = "root";
		String password = "root";
		
	Connection conn=null;
	try {
	Class.forName("com.mysql.jdbc.Driver");
	conn = DriverManager.getConnection(url+databaseName, username, password);
	String sqlquery = "select * from projects";
	Statement statement = conn.createStatement();
	ResultSet result = statement.executeQuery(sqlquery);
	result.next();
	System.out.println(result.getString("id"));
	System.out.println(result.getString("name"));
	System.out.println(result.getString("description"));
	}
	catch (Exception e)
	{
		System.out.println(e.getStackTrace());
	}
	
	finally
	{
		if (conn!= null)
			conn = null;
	}
	
}

}
