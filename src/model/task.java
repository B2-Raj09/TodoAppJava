package model;

import java.util.Date;
import java.sql.Timestamp;

public class task {

	private int task_id;
	private String task_name;
	private String is_done;
	private String createdAt;
	private String doneAt;
	
	public task(int task_id, String task_name, String is_done, String createdAt, String doneAt) {
		super();
		this.task_id = task_id;
		this.task_name = task_name;
		this.is_done = is_done;
		this.createdAt = createdAt;
		this.doneAt = doneAt;
	}
	
	public int getTask_id() {
		return task_id;
	}



	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}



	public String getTask_name() {
		return task_name;
	}



	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}



	public String getIs_done() {
		return is_done;
	}



	public void setIs_done(String is_done) {
		this.is_done = is_done;
	}



	public String getCreatedAt() {
		return createdAt;
	}



	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}



	public String getDoneAt() {
		return doneAt;
	}



	public void setDoneAt(String doneAt) {
		this.doneAt = doneAt;
	}
	
}
