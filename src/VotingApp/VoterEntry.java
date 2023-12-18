package VotingApp;

import java.util.ArrayList;
import java.util.List;

public class VoterEntry {
	private ArrayList<User> voter = new ArrayList<>();

	public List<User> getVoter() {
		return voter;
	}

	public void setVoter(User voter) {
		this.voter.add(voter);
	}

	public void totalVoter() {
		System.out.println("Total voter count: " + voter.size() + "\n");
	}

	public User getUser(String mobile) {
		for (int i = 0; i < this.voter.size(); i++) {
			if (voter.get(i).getMobile().compareTo(mobile) == 0) {
				return voter.get(i);
			}
		}
		return null;
	}
}
