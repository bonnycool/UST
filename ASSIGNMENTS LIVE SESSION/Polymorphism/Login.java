package Polymorphism;

public class Login {

	
	void login(String email ) {
		System.out.println("Email is "+email);
		
	}
	void login(String email,String password) {
		System.out.println("Email :"+email+" Passowrd:"+password);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login l1=new Login();
		l1.login("admin@gmail.com");

		l1.login("ADMIN@GMAIL.COM", "pass21341");
	}

}
