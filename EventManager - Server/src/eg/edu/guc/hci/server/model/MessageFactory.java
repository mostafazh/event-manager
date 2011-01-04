package eg.edu.guc.hci.server.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.simpleframework.xml.core.Persister;

public class MessageFactory extends Message implements ModelFactory<Message> {

	
	//Almost the same for all the classes.
	public ArrayList<String> getColumnNames() {
		ArrayList<String> result = new ArrayList<String>();
		result.add(message_id_column);
		result.add(title_column);
		result.add(type_column);
		result.add(text_column);
		result.add(voice_column);
		return result;
	}

	/**
	 * Given a <code>ResultSet</code> the method will convert the top record of
	 * the <code>ResultSet</code> to a Message Object.
	 * 
	 * @param rs
	 *            a <code>ResultSet</code> with at least one record.
	 */
	public Message newModel(ResultSet rs) {
		Message u = null;
		try {
			u = new Message( rs.getInt(message_id_column), rs.getString(title_column), rs.getInt(type_column), rs.getString(text_column), rs.getString(voice_column) );
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}

	// The Same for almost all the classes [Just change Message to the other Class
	// name]
	public Message newModel(String s) {
		try {
			return new Persister().read(Message.class, s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
