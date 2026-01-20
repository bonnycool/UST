package unit_testing;

public class ExceptionForInvalidAge {
	
	void  ExceptionAge(int age)
	{
		if(age<18)
		{
			throw new IllegalArgumentException("Age Is not valid");
		}
	}

}
