package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connectMysql {

	/*
	 * public static Connection connect() { // TODO Auto-generated method stub try {
	 * 
	 * } catch (Exception e) { System.err.println(e.getMessage()); } return conn; }
	 */

	public static PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException {
		
			PreparedStatement ps = null;
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/todoapp";
			String user = "root";
			String pass = "";
			Connection conn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection established...");
			ps = conn.prepareStatement(sql);
			return ps;
			/*
			 * String query = "SELECT * FROM task"; Statement stmt = conn.createStatement();
			 * ResultSet rs = stmt.executeQuery(query);
			 */
	}
}
