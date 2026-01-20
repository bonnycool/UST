package unit_testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ListSizeTesting {

	
	ListSize ls=new ListSize();
	
	@Test
	void ListSizeTaking()
	{
		assertEquals(ls.ListSizeTaking(),3);
	}
}
