package edu.mum.cs.db;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {
	public static Connection conn;

	public static Connection getConnection() {

		if (conn != null)
			return conn;
		Properties props = new Properties();
		try {
			ClassLoader loader = Thread.currentThread().getContextClassLoader();

			InputStream in = loader.getResourceAsStream("db.properties");
			props.load(in);
			in.close();

			String driver = props.getProperty("jdbc.driver");
			if (driver != null) {
				Class.forName(driver);
			}

			String url = props.getProperty("jdbc.url");
			String username = props.getProperty("jdbc.username");
			String password = props.getProperty("jdbc.password");

			conn = DriverManager.getConnection(url, username, password);
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Could not read file");
		} catch (ClassNotFoundException e) {
			System.err.println("Driver incompatible or not found");
		} catch (SQLException e) {
			System.err.println("Could not create connection");
		}
		return conn;
	}
}
