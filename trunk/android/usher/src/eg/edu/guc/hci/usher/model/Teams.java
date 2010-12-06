package eg.edu.guc.hci.usher.model;

import java.util.ArrayList;

public class Teams {
	private ArrayList<Team> teams = new ArrayList<Team>();

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

	public ArrayList<Team> getTeams() {
		return teams;
	}
}
