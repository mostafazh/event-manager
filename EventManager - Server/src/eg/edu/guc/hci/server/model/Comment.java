package eg.edu.guc.hci.server.model;

import java.sql.Date;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root
public class Comment extends Model {
	// Actual names of the columns in the DB.
	public static final String username_column = "username";
	public static final String task_id_column = "task_id";
	public static final String comment_column = "comment";
	public static final String time_column = "time";

	@Attribute
	private String username;	
	@Attribute
	private int task_id;
	@Attribute
	private String comment;
	@Attribute
	private Date time;

	public Comment(String username, int task_id, String comment, Date time) {
		super();
		this.username = username;
		this.task_id = task_id;
		this.comment = comment;
		this.time = time;
	}

	// All the getters and setters can be automatically generated (right click
	// in any place in the Class -> Source -> Generate Getters and Setters.).

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getTask_id() {
		return task_id;
	}

	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}


	
}