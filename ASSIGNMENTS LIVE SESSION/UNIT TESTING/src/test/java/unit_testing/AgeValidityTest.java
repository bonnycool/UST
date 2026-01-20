package unit_testing;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AgeValidityTest {
	
	AgeValidity av=new AgeValidity();
	
	@Test
	void validateAge() {
		assertTrue(av.checkAge(19));
	}
	
	@Test
	void notEligible() {
		assertFalse(av.checkAge(12));;
	}

}
