
package unit_testing;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class LoginTest {
	
	Login login =new Login();
	
	@Test
	void validateLogin() {
		
		assertTrue(login.validateResult("admin", "admin123"));
		
	}
	
	@Test
	void validateLoginInvalid()
	{
		assertTrue(login.validateResult("ad", "123"));
	}
	

}
