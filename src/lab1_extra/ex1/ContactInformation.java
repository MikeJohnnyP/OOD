package lab1_extra.ex1;

public class ContactInformation {
	private String email;
	private String phoneNumber;

	public ContactInformation(String email, String phoneNumber) {
		this.email = email;
		this.phoneNumber = phoneNumber;

}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "email: " + email + ", SDT: " + phoneNumber;
	}
	

	
	

}
