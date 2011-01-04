package eg.edu.guc.hci.server.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root
public class Evaluation extends Model {
	// Actual names of the columns in the DB.
	public static final String evaluation_id_column = "evaluation_id";
	public static final String comment_column = "comment";


	@Attribute
	private int evaluation_id;
	@Attribute
	private String comment;
	
	public Evaluation() {
	}	
	
	public Evaluation(int evaluation_id, String comment) {
		super();
		this.evaluation_id = evaluation_id;
		this.comment = comment;
	}
	
	public int getEvaluation_id() {
		return evaluation_id;
	}
	public void setEvaluation_id(int evaluation_id) {
		this.evaluation_id = evaluation_id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	
}