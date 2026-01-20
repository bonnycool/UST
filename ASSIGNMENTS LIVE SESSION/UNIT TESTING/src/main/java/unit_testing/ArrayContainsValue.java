package unit_testing;

public class ArrayContainsValue {
	
	boolean LinearSearch(int number)
	{
		
		boolean result=false;
		int arr[]=new int[12];
		for(int i=0;i<12;i++)
		{
			arr[i]=i;
		}
		
		for(int i=0;i<12;i++)
		{
			if(arr[i]==number)
			{
				result=true;
				break;
			}
		}
		return result;
	}

}
