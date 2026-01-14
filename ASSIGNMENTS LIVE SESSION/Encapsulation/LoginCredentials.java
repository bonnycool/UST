package Encapsulation;

public class LoginCredentials {

	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		
		this.email = email.toLowerCase();
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		String str1=password;
		int length=str1.length();
		if(length<8)
		{
			System.out.println("Password length should be atleast 8 character");
		}
		else {
		this.password = password;
		}
	}
	private String password;
	
	
}
