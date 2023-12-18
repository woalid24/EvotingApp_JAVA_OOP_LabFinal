package VotingApp;

import java.util.Scanner;

public class UsersOperation {
	public User userRegistration() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scanner.nextLine();
		System.out.println("Please enter your mobile number");
		String mobile = scanner.next();
		scanner.nextLine();
		System.out.println("Please enter your address");
		String address = scanner.nextLine();
		
		User user = new User(name, mobile, address);
		return user;
	}

}