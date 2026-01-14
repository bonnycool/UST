package Encapsulation;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoginCredentials login1=new LoginCredentials();
		
		login1.setEmail("AdMin@gmail.com");
		login1.setPassword("avcae");
		
		System.out.println("Email ="+login1.getEmail());
		System.out.println("Password ="+login1.getPassword());
	}

}
