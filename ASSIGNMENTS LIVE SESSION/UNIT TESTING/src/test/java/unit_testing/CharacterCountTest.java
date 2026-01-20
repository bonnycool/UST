package unit_testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterCountTest {
	
	CharacterCount cc=new CharacterCount();
	
	@Test
	void CharacterTest() {
		
		assertEquals(cc.countOfCharacters("BoNNY"),5);
	}

}
