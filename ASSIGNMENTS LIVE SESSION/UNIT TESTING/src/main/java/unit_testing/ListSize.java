package unit_testing;

import java.util.ArrayList;
import java.util.List;

public class ListSize {
	
	int ListSizeTaking()
	{
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(1);
		lst.add(1);
		lst.add(1);
		
		return lst.size();
	}

}
