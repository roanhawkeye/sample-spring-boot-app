package contacts;

public class Contact{
	private Long id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String emailAddress;

	public void setId(Long id){
		this.id = id;
	}

	public Long getId(){
		return this.id;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return this.firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return this.lastName;
	}

	public void setEmailAddress(String emailAddress){
		this.emailAddress = emailAddress;
	}

	public String getEmailAddress(){
		return this.emailAddress;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return this.phoneNumber;
	}
}