
package unit_testing;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ArrayContainsValueTest {
	
	ArrayContainsValue acv=new ArrayContainsValue();
	
	@Test
	void checkLinear() {
		assertTrue(acv.LinearSearch(3));
	}

}
