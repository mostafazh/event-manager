package eg.edu.guc.hci.server.model;

import java.sql.Date;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root
public class Task extends Model {
	// Actual names of the columns in the DB.
	public static final String task_id_column = "task_id";
	public static final String title_column = "title";
	public static final String priority_column = "priority";
	public static final String description_column = "description";
	public static final String notes_column = "notes";
	public static final String deadline_column = "deadline";
	public static final String status_column = "status";

	@Attribute
	private int task_id;
	@Attribute
	private String title;
	@Attribute
	private int priority;
	@Attribute
	private String description;
	@Attribute
	private String notes;
	@Attribute
	private Date deadline;
	@Attribute
	private int status;

	public Task() {

	}

	public Task(int task_id, String title, int priority, String description,
			String notes, Date deadline, int status) {
		super();
		this.task_id = task_id;
		this.title = title;
		this.priority = priority;
		this.description = description;
		this.notes = notes;
		this.deadline = deadline;
		this.status = status;
	}

	public int getTask_id() {
		return task_id;
	}

	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}


	// All the getters and setters can be automatically generated (right click
	// in any place in the Class -> Source -> Generate Getters and Setters.).


}