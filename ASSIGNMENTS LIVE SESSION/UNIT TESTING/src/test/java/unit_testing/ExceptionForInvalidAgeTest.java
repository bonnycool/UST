package unit_testing;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ExceptionForInvalidAgeTest {

	
	ExceptionForInvalidAge efia=new ExceptionForInvalidAge();
	
	@Test
	void TestException() {
		
		assertThrows(IllegalArgumentException.class, () -> {
           efia.ExceptionAge(15);
		 });
		
	}
}
