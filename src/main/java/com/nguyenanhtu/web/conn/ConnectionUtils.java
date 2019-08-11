package com.nguyenanhtu.web.conn;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUtils {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		return MySQLConnUtils.getMySQLConnection();
	}

	public static void rollbackQuietly(Connection conn) {
		// TODO Auto-generated method stub
	}

	public static void closeQuietly(Connection conn) {
		// TODO Auto-generated method stub
	}
}
