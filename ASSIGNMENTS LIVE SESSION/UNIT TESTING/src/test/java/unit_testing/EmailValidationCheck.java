package unit_testing;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class EmailValidationCheck {
	
	
	EmailValidation evc=new EmailValidation();
	@Test
	void EmailCheckTest() {
		assertTrue(evc.EmailValid("Admin@gmail.com"));
	}

}
