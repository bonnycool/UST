package unit_testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UpperCaseConversionTest {

	UpperCaseConversion ucc=new UpperCaseConversion();
	@Test
	void checkUpperCaseConversion() {
		
		assertEquals(ucc.UpperCaseCheck("bonny"),"BONNY");
	}
}
