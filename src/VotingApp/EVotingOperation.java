package VotingApp;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class EVotingOperation {
	public void takeVote(VoterEntry ve, Set uu, List<Integer> v) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your mobile number");
		String mobile = scan.next();
		User user = ve.getUser(mobile);
		if (user == null) {
			System.out.println("Please register first\n");
			return;
		}
		int setSize = uu.size();
		uu.add(user);
		if (uu.size() == setSize) {
			System.out.println("You have already taken\n");
			return;
		}
		System.out.println("1 for hasib");
		System.out.println("2 for tonni");
		System.out.println("3 for shitol");
		System.out.println("3 for saba");
		Integer vote = scan.nextInt();
		v.add(vote);
	}
	
	void votecount(List<Integer> vote) {
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
		for (Integer x : vote) {
			int key = x;
			int value = count.getOrDefault(x, 0);
			count.put(key, value + 1);
		}
		System.out.println();
		for (var n : count.entrySet()) {
			if (n.getKey() == 1) {
				System.out.println("Tania got: " + n.getValue() + " Votes");
			} else if (n.getKey() == 2) {
				System.out.println("Sabit got: " + n.getValue() + " Votes");
			} else if (n.getKey() == 3) {
				System.out.println("Asif got: " + n.getValue() + " Votes");
			}
		}
		System.out.println();
	}

}
