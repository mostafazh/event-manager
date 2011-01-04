package eg.edu.guc.hci.server.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root
public class User extends Model {
	// Actual names of the columns in the DB.
	public static final String username_column = "username";
	public static final String password_column = "password";
	public static final String name_column = "name";
	public static final String rating_column = "rating";
	public static final String type_id_column = "type_id";
	public static final String evaluation_id_column = "evaluation_id";
	public static final String image_column = "image";
	public static final String team_id_column = "team_id";

	@Attribute
	private String username;
	@Attribute
	private String password;
	@Attribute
	private String name;
	@Attribute
	private int rating;
	@Attribute
	private int type_id;
	@Attribute
	private int evaluation_id;
	@Attribute
	private String image;
	@Attribute
	private int team_id;

	public User() {

	}



	public User(String username, String password, String name, int rating,
			int type_id, int evaluation_id, String image, int team_id) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.setRating(rating);
		this.type_id = type_id;
		this.setEvaluation_id(evaluation_id);
		this.setImage(image);
		this.setTeam_id(team_id);
	}



	// All the getters and setters can be automatically generated (right click
	// in any place in the Class -> Source -> Generate Getters and Setters.).

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType_id() {
		return type_id;
	}

	public void setType_id(int type_id) {
		this.type_id = type_id;
	}



	public void setRating(int rating) {
		this.rating = rating;
	}



	public int getRating() {
		return rating;
	}



	public void setEvaluation_id(int evaluation_id) {
		this.evaluation_id = evaluation_id;
	}



	public int getEvaluation_id() {
		return evaluation_id;
	}



	public void setImage(String image) {
		this.image = image;
	}



	public String getImage() {
		return image;
	}



	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}



	public int getTeam_id() {
		return team_id;
	}
}