package eg.edu.guc.hci.server.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.simpleframework.xml.core.Persister;

public class TeamFactory extends Team implements ModelFactory<Team> {

	
	//Almost the same for all the classes.
	public ArrayList<String> getColumnNames() {
		ArrayList<String> result = new ArrayList<String>();
		result.add(team_id_column);
		result.add(name_column);
		return result;
	}

	/**
	 * Given a <code>ResultSet</code> the method will convert the top record of
	 * the <code>ResultSet</code> to a Team Object.
	 * 
	 * @param rs
	 *            a <code>ResultSet</code> with at least one record.
	 */
	public Team newModel(ResultSet rs) {
		Team u = null;
		try {
			u = new Team( rs.getInt(team_id_column), rs.getString(name_column));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}

	// The Same for almost all the classes [Just change Team to the other Class
	// name]
	public Team newModel(String s) {
		try {
			return new Persister().read(Team.class, s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
