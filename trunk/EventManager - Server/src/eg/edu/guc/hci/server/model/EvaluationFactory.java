package eg.edu.guc.hci.server.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.simpleframework.xml.core.Persister;

public class EvaluationFactory extends Evaluation implements ModelFactory<Evaluation> {

	
	//Almost the same for all the classes.
	public ArrayList<String> getColumnNames() {
		ArrayList<String> result = new ArrayList<String>();
		result.add(evaluation_id_column);
		result.add(comment_column);
		return result;
	}

	/**
	 * Given a <code>ResultSet</code> the method will convert the top record of
	 * the <code>ResultSet</code> to a Evaluation Object.
	 * 
	 * @param rs
	 *            a <code>ResultSet</code> with at least one record.
	 */
	public Evaluation newModel(ResultSet rs) {
		Evaluation u = null;
		try {
			u = new Evaluation( rs.getInt(evaluation_id_column), rs.getString(comment_column));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}

	// The Same for almost all the classes [Just change Evaluation to the other Class
	// name]
	public Evaluation newModel(String s) {
		try {
			return new Persister().read(Evaluation.class, s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
