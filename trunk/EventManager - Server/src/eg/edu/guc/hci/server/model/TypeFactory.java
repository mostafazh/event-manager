package eg.edu.guc.hci.server.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.simpleframework.xml.core.Persister;

public class TypeFactory extends Type implements ModelFactory<Type> {

	
	//Almost the same for all the classes.
	public ArrayList<String> getColumnNames() {
		ArrayList<String> result = new ArrayList<String>();
		result.add(type_id_column);
		result.add(name_column);
		result.add(description_column);
		return result;
	}

	/**
	 * Given a <code>ResultSet</code> the method will convert the top record of
	 * the <code>ResultSet</code> to a Type Object.
	 * 
	 * @param rs
	 *            a <code>ResultSet</code> with at least one record.
	 */
	public Type newModel(ResultSet rs) {
		Type u = null;
		try {
			u = new Type( rs.getInt(type_id_column), rs.getString(name_column), rs.getString(description_column) );
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}

	// The Same for almost all the classes [Just change Type to the other Class
	// name]
	public Type newModel(String s) {
		try {
			return new Persister().read(Type.class, s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
