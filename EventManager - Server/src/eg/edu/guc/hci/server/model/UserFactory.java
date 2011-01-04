package eg.edu.guc.hci.server.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.simpleframework.xml.core.Persister;

public class UserFactory extends User implements ModelFactory<User> {

	
	//Almost the same for all the classes.
	public ArrayList<String> getColumnNames() {
		ArrayList<String> result = new ArrayList<String>();
		result.add(username_column);
		result.add(password_column);
		result.add(name_column);
		result.add(rating_column);
		result.add(type_id_column);
		result.add(evaluation_id_column);
		result.add(image_column);
		return result;
	}

	/**
	 * Given a <code>ResultSet</code> the method will convert the top record of
	 * the <code>ResultSet</code> to a User Object.
	 * 
	 * @param rs
	 *            a <code>ResultSet</code> with at least one record.
	 */
	public User newModel(ResultSet rs) {
		User u = null;
		try {
			u = new User(rs.getString(username_column),
					rs.getString(password_column), rs.getString(name_column),
					rs.getInt(rating_column),rs.getInt(type_id_column),rs.getInt(evaluation_id_column),rs.getString(image_column),rs.getInt(team_id_column));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}

	// The Same for almost all the classes [Just change User to the other Class
	// name]
	public User newModel(String s) {
		try {
			return new Persister().read(User.class, s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
