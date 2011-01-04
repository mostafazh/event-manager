package eg.edu.guc.hci.server.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root
public class Type extends Model {
	// Actual names of the columns in the DB.
	public static final String type_id_column = "type_id";
	public static final String name_column = "name";
	public static final String description_column = "description";

	@Attribute
	private int type_id;
	@Attribute
	private String name;
	@Attribute
	private String description;
	
	public int getType_id() {
		return type_id;
	}

	public void setType_id(int type_id) {
		this.type_id = type_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Type(){
	}
	
	public Type(int type_id, String name, String description) {
		super();
		this.type_id = type_id;
		this.name = name;
		this.description = description;
	}



}