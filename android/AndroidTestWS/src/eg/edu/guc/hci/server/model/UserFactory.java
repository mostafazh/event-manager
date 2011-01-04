package eg.edu.guc.hci.server.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.simpleframework.xml.core.Persister;

public class UserFactory extends User implements ModelFactory<User> {

	public ArrayList<String> getColumnNames() {
		ArrayList<String> result = new ArrayList<String>();
		result.add(username_column);
		result.add(password_column);
		result.add(name_column);
		result.add(type_id_column);
		return result;
	}

	public User newModel(ResultSet rs) {
		User u = null;
		try {
			u = new User(rs.getString(username_column),
					rs.getString(password_column), rs.getString(name_column),
					rs.getInt(type_id_column));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}

	public User newModel(String s) {
		try {
			return new Persister().read(User.class, s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
