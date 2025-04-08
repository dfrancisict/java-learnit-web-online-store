package com.itbulls.learnit.onlinestore.persistence.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.itbulls.learnit.onlinestore.persistence.utils.connectionpools.DbcpDemo;

public class DBUtils {
	
	private DBUtils() {
	}
	
	public static Connection getConnection() {
		try {
			return DbcpDemo.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
