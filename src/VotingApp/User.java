package VotingApp;

public class User {
	private String name;
	private String mobile;
	private String address;

	User(String name, String mobile, String address) {
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		System.out.println("Voter Information\nName: " + name + "mobile: " + mobile + " address: " + address);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
