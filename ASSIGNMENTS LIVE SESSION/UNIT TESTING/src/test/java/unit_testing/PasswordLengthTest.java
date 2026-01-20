package unit_testing;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PasswordLengthTest {
	
	PasswordLength pl =new PasswordLength();
	@Test
	void passwordValidityCheck() {
		assertTrue(pl.PasswordLengthCheck("hello@wegqe"));
	}

}
