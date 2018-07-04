package doa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import db.connectMysql;
import model.task;

public class DataAccess {

	//Method to add the task in the DB
	public void addNew(task t) {
		
		try {
			PreparedStatement ps = connectMysql.getPreparedStatement("insert into task values(?,?,?,?)");
			ps.setString(1, t.getTask_name());
			ps.setString(2, t.getIs_done());
			ps.setString(3, t.getCreatedAt());
			ps.setString(4, t.getDoneAt());
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Method to read the task row from DB
	public static List<task> getAll() {
		List<task> ls = new LinkedList<>();
		
		try {
			ResultSet rs = connectMysql.getPreparedStatement("select * from task").executeQuery();
			
			while(rs.next()) {
				task t = new task(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				ls.add(t);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ls;
	}
	
	public static List<task> getTaskById(int task_id) {
		List<task> ls = new LinkedList<>();
		String sql = "select * from task where task_id = " +task_id;
		try {
			ResultSet rs = connectMysql.getPreparedStatement(sql).executeQuery();
			
			while(rs.next()) {
				task t = new task(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				ls.add(t);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE,null,e);
			e.printStackTrace();
		}
		
		return ls;
	}
	
	public void edit(int task_id, String task_name, String is_done) {
		
		try {
			String sql = "update task set task_name=?,is_done=?" + " where task_id =?";
			PreparedStatement ps = connectMysql.getPreparedStatement(sql);
			ps.setString(1, task_name);
			ps.setString(2, is_done);
			ps.setInt(3, task_id);
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void delete(int task_id) {
		
		try {
			String sql = "delete task where id=?";
			PreparedStatement ps = connectMysql.getPreparedStatement(sql);
			ps.setInt(1, task_id);
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
