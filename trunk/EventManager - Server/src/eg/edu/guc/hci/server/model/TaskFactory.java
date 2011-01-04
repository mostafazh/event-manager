package eg.edu.guc.hci.server.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.simpleframework.xml.core.Persister;

public class TaskFactory extends Task implements ModelFactory<Task> {

	
	//Almost the same for all the classes.
	public ArrayList<String> getColumnNames() {
		ArrayList<String> result = new ArrayList<String>();
		result.add(task_id_column);
		result.add(title_column);
		result.add(priority_column);
		result.add(description_column);
		result.add(notes_column);
		result.add(deadline_column);
		result.add(status_column);
		return result;
	}

	/**
	 * Given a <code>ResultSet</code> the method will convert the top record of
	 * the <code>ResultSet</code> to a Task Object.
	 * 
	 * @param rs
	 *            a <code>ResultSet</code> with at least one record.
	 */
	public Task newModel(ResultSet rs) {
		Task u = null;
		try {
			u = new Task(rs.getInt(task_id_column), rs.getString(title_column), rs.getInt(priority_column),
					rs.getString(description_column), rs.getString(notes_column), rs.getDate(deadline_column), 
					rs.getInt(status_column));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}

	// The Same for almost all the classes [Just change Task to the other Class
	// name]
	public Task newModel(String s) {
		try {
			return new Persister().read(Task.class, s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
