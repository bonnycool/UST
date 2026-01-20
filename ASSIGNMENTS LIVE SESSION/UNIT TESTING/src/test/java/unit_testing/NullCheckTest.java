package unit_testing;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class NullCheckTest {
	
	
	NullCheck nc=new NullCheck();
	@Test
	void CheckNull()
	{
		assertNotNull(nc.CheckingNull("hell0"));
	}
	
	@Test
	void CheckNotNull()
	{
		assertNull(nc.CheckingNull(null));
	}

}
