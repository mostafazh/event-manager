package eg.edu.guc.hci.server.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.simpleframework.xml.core.Persister;

public class CommentFactory extends Comment implements ModelFactory<Comment> {

	
	//Almost the same for all the classes.
	public ArrayList<String> getColumnNames() {
		ArrayList<String> result = new ArrayList<String>();
		result.add(username_column);
		result.add(task_id_column);
		result.add(comment_column);
		result.add(time_column);
		return result;
	}

	/**
	 * Given a <code>ResultSet</code> the method will convert the top record of
	 * the <code>ResultSet</code> to a Comment Object.
	 * 
	 * @param rs
	 *            a <code>ResultSet</code> with at least one record.
	 */
	public Comment newModel(ResultSet rs) {
		Comment u = null;
		try {
			u = new Comment( rs.getString(username_column), rs.getInt(task_id_column), rs.getString(comment_column), rs.getDate(time_column) );
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}

	// The Same for almost all the classes [Just change Comment to the other Class
	// name]
	public Comment newModel(String s) {
		try {
			return new Persister().read(Comment.class, s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
