package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect_File 
{
	
	public static Connection getConnection() throws Exception{
	
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root123");
		return con;
		
	}
	
}
