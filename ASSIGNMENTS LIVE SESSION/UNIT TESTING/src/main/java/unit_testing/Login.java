package unit_testing;

public class Login {
		
	
		public 	boolean validateResult(String u,String  p) {
			
			String username="admin";
			String password="admin123";
			
			return username.equals(u) && password.equals(p);
			
		}
	}

