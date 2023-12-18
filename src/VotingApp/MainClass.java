//  ID: 222-15-6384
//	Make a e-voting system for the people's Republic of Bangladesh.
//	The system has the capabilities to take vote but not more than one and can calculate the results of individual candidate.
//  Make at least 3 candidates for this system.



package VotingApp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;



public class MainClass {

	public static void main(String[] args) {
		HashSet<User> uniqueUser = new HashSet();
		ArrayList<Integer> voteCount = new ArrayList();
		
		VoterEntry ve = new VoterEntry();
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("E-Voting System");
			System.out.println("Press 1 for new voter");
			System.out.println("Press 2 for entry vote");
			System.out.println("Press 3 for count vote");
			System.out.println("Press 0 for exit");
			int choice = scanner.nextInt();
			UsersOperation uo = new UsersOperation();
			if (choice == 1) {
				ve.setVoter(uo.userRegistration());
				ve.totalVoter();
			} else if (choice == 2) {
				EVotingOperation vo = new EVotingOperation();
				vo.takeVote(ve, uniqueUser, voteCount);
			} else if (choice == 3) {
				EVotingOperation operation = new EVotingOperation();
				operation.votecount(voteCount);
			} else if (choice == 0) {
				System.out.println("Thanks for using our voting system.");
				break;
			} else {
				System.out.println("You are pressing wrong digit");
			}
		}
	}

}
