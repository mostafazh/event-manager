package eg.edu.guc.hci.usher.model;

public class TeamMember {
	private String name;
	private String type;
	private String picture;

	public TeamMember(String name, String type,String picture) {
		this.setName(name);
		this.setType(type);
		this.setPicture(picture);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getPicture() {
		return picture;
	}
	
	
}