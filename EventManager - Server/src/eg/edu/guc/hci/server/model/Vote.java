package eg.edu.guc.hci.server.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root
public class Vote extends Model {
	// Actual names of the columns in the DB.
	public static final String vote_id_column = "vote_id";
	public static final String title_column = "title";


	@Attribute
	private int vote_id;
	@Attribute
	private String title;
	
	public Vote() {
	}

	public Vote(int vote_id, String title) {
		super();
		this.vote_id = vote_id;
		this.title = title;
	}

	public int getVote_id() {
		return vote_id;
	}

	public void setVote_id(int vote_id) {
		this.vote_id = vote_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}	
	

	
}