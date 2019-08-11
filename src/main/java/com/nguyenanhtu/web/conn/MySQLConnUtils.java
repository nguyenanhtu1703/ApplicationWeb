package com.nguyenanhtu.web.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnUtils {
	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException {
		String hostName = "localhost";
		String dbName = "productsdb";
		String userName = "root";
		String password = "Lenovoy700";
		return getMySQLConnection(hostName, dbName, userName, password);
	}
	
	public static Connection getMySQLConnection(String h, String d, String u, String p) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String connectionURL = "jdbc:mysql://" + h + ":3306/" + d;
		return DriverManager.getConnection(connectionURL, u, p);
	}
}
