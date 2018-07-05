package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connectMysql {

	private static String url = "jdbc:mysql://localhost/todoapp";
	private static String user = "root";
	private static String pass = "";
	private static Connection conn = null;
	/* public static Connection connect(String sql) { // TODO Auto-generated method stub 
		 try {
			 conn = DriverManager.getConnection(url, user, pass);
				System.out.println("Connection established...");
				
	 } catch (SQLException e) { 
		 System.err.println(e.getMessage()); 
		 } 
		 return conn;
		  }*/
	public static PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException {
		
		PreparedStatement ps = null;
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, user, pass);
		System.out.println("Connection established...");
		ps = conn.prepareStatement(sql);
		return ps;
		 
}
	/*public static void main(String[] args) {
		
			connectMysql cm = new connectMysql();
			try {
				PreparedStatement ps = connectMysql.getPreparedStatement("");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}*/

	/*public static PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException {
		
			PreparedStatement ps = null;
//			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/todoapp";
			String user = "root";
			String pass = "";
			Connection conn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection established...");
			ps = conn.prepareStatement(sql);
			return ps;
			
			 * String query = "SELECT * FROM task"; Statement stmt = conn.createStatement();
			 * ResultSet rs = stmt.executeQuery(query);
			 
	}*/
	
}
