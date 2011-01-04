package eg.edu.guc.hci.server.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root
public class Team extends Model {
	// Actual names of the columns in the DB.
	public static final String team_id_column = "team_id";
	public static final String name_column = "name";


	@Attribute
	private int team_id;
	@Attribute
	private String name;
	
	public Team() {

	}

	public int getTeam_id() {
		return team_id;
	}

	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Team(int team_id, String name) {
		super();
		this.team_id = team_id;
		this.name = name;
	}


}