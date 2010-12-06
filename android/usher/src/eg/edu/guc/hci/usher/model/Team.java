package eg.edu.guc.hci.usher.model;

import java.util.ArrayList;

public class Team {
	private ArrayList<TeamMember> members;
	private String name;

	public Team(String name) {
		members = new ArrayList<TeamMember>();
		this.setName(name);
	}

	public void add(TeamMember tm) {
		members.add(tm);
	}
	
	public void setMembers(String name) {
		this.name = name;
	}

	public ArrayList<TeamMember> getMembers() {
		return members;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
