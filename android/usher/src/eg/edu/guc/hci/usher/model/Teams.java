package eg.edu.guc.hci.usher.model;

import java.util.ArrayList;
import java.util.List;

public class Teams {
	private List<Team> teams = new ArrayList<Team>();

	public Teams() {
		Team team1 = new Team("Team 1");
		team1.add(new TeamMember("Ashry", "Leader","pic"));
		team1.add(new TeamMember("Member1", "Usher","pic"));
		team1.add(new TeamMember("Member2", "Usher","pic"));

		Team team2 = new Team("Team 2");
		team2.add(new TeamMember("Zaher", "Leader","pic"));
		team2.add(new TeamMember("Member1", "Usher","pic"));
		team2.add(new TeamMember("Member2", "Usher","pic"));

		teams.add(team1);
		teams.add(team2);
	}

	public List<Team> getTeams() {
		return teams;
	}
	
	public List<TeamMember> getTeamsMembers() {
		List<TeamMember> tm = new ArrayList<TeamMember>();
		for(int i=0;i<teams.size();i++){
			tm.addAll(teams.get(i).getMembers());
		}
		return tm;
	}
}
