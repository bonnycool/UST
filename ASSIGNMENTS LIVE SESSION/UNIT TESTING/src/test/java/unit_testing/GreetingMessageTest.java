package unit_testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GreetingMessageTest {
	
	GreetingMessage gm=new GreetingMessage();
	
	@Test
	void GreetTest() {
		assertEquals(gm.Greeting("Bonny"),"Welcome,Bonny");
	}

}
