package eg.edu.guc.hci.teamleader.model;

import java.util.ArrayList;

import eg.edu.guc.hci.teamleader.server.model.Team;
import eg.edu.guc.hci.teamleader.server.model.User;
import eg.edu.guc.hci.teamleader.ws.TeamResource;

public class TeamManager {
	private Team team;
	private ArrayList<User> members;

	public TeamManager(Team team, ArrayList<User> members) {
		this.setMembers(members);
		this.setTeam(team);
	}
	
	public TeamManager(User member) throws Exception{
		team = getTeamByMember(member);
		members = getTeamMembersByTeamID(team.getTeam_id());
	}
	
	public Team getTeamByMember(User member) throws Exception {
		return new TeamResource().getTeamByMember(member);
	}
	
	public ArrayList<User> getTeamMembersByTeamID(int teamID) throws Exception{
		return new TeamResource().getTeamMembersByTeamID(teamID);
	}
	
	public TeamManager() {}

	public void add(User tm) {
		members.add(tm);
	}
	
	public void setMembers( ArrayList<User> members) {
		this.members = members;
	}

	public ArrayList<User> getMembers() {
		return members;
	}
	
	public void setTeam(Team team) {
		this.team = team;
	}

	public Team getTeam() {
		return team;
	}
}
