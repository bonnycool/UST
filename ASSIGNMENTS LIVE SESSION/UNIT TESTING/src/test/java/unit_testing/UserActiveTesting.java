package unit_testing;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class UserActiveTesting {
	
	UserActive ua=new UserActive();
	
	@Test
	void UserActiveTest(){
		
		assertTrue(ua.CheckUserActve(true));
	}

}
