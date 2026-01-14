package object;

public class UserObj {

	String email;
	String password;
	
	UserObj(String email){
		this.email=email;
		System.out.println("Constructor takes only email only");
		
	}
	
	UserObj(String email,String password){
		this.email=email;
		this.password=password;
		System.out.println("This constructor takes both ");
	}
	
	void display() {
		System.out.println("Email :"+email);
		System.out.println("Password:"+password);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserObj User1=new UserObj("ADMIN@GMAIL.COM");
		
		
		User1.display();
		
		UserObj User2=new UserObj("admin@gmail.com","admin123");
		User2.display();
		
	}

}
