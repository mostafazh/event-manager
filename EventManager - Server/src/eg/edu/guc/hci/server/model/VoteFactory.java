package eg.edu.guc.hci.server.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.simpleframework.xml.core.Persister;

public class VoteFactory extends Vote implements ModelFactory<Vote> {

	
	//Almost the same for all the classes.
	public ArrayList<String> getColumnNames() {
		ArrayList<String> result = new ArrayList<String>();
		result.add(vote_id_column);
		result.add(title_column);
		return result;
	}

	/**
	 * Given a <code>ResultSet</code> the method will convert the top record of
	 * the <code>ResultSet</code> to a Vote Object.
	 * 
	 * @param rs
	 *            a <code>ResultSet</code> with at least one record.
	 */
	public Vote newModel(ResultSet rs) {
		Vote u = null;
		try {
			u = new Vote( rs.getInt(vote_id_column), rs.getString(title_column));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}

	// The Same for almost all the classes [Just change Vote to the other Class
	// name]
	public Vote newModel(String s) {
		try {
			return new Persister().read(Vote.class, s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
