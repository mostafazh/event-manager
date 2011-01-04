package eg.edu.guc.hci.server.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root
public class User extends Model {
	// Actual names of the columns in the DB.
	public static final String username_column = "username";
	public static final String password_column = "password";
	public static final String name_column = "name";
	public static final String type_id_column = "type_id";

	@Attribute
	private String username;
	@Attribute
	private String password;
	@Attribute
	private String name;
	@Attribute
	private int type_id;

	public User() {

	}

	public User(String username, String password, String name, int type_id) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.type_id = type_id;
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
}