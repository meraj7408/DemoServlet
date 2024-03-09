package com.javatpoint.dao;

import java.sql.*;

public class DB {
public static Connection getCon() throws ClassNotFoundException, SQLException{
	
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eLibrary","root","root");
		
	
	return con;

 
}
}
