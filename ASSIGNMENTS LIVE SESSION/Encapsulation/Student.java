package Encapsulation;

public class Student {
	public static void main(String args[])
	{
		StudentDetails stud1=new StudentDetails();
		
		stud1.setId(1);
		stud1.setName("Bonny");
		
		System.out.println("id is  "+stud1.getId());
		System.out.println("Name is "+stud1.getName());
		
	}

}
