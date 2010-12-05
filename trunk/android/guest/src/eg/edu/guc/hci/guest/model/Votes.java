package eg.edu.guc.hci.guest.model;

import java.util.ArrayList;

public class Votes {
	private static final String[] openVotes = { "Favourite song",
			"Favourite place", "Best Performer" };
	// private static final String[] openVotes = new String[0];
	private static final String[] closedVotes = { "Vote 1" };

	public ArrayList<Vote> getVotes() {
		ArrayList<Vote> openVotes = getOpenVotes();
		openVotes.addAll(getClosedVotes());
		return openVotes;
	}

	public ArrayList<Vote> getOpenVotes() {
		ArrayList<Vote> result = new ArrayList<Vote>(openVotes.length);
		int id = 0;
		for (String s : openVotes) {
			result.add(new Vote(id, s));
			id++;
		}
		return result;
	}

	public ArrayList<String> getOpenVotesTitles() {
		ArrayList<String> result = new ArrayList<String>(openVotes.length);
		for (Vote v : getOpenVotes())
			result.add(v.getTitle());
		return result;
	}

	public ArrayList<Vote> getClosedVotes() {
		ArrayList<Vote> result = new ArrayList<Vote>(closedVotes.length);
		int id = openVotes.length;
		for (String s : closedVotes) {
			result.add(new Vote(id, s));
			id++;
		}
		return result;
	}

	public ArrayList<String> getClosedVotesTitles() {
		ArrayList<String> result = new ArrayList<String>(closedVotes.length);
		for (Vote v : getClosedVotes())
			result.add(v.getTitle());
		return result;
	}
}
