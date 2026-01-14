package object;

public class Studentobj {
	
	int id;
	String name;
	
	
	void displayDetails(){
		System.out.println("Id is "+id);
		System.out.println("Name is "+name);
	}
	
	public static void main(String args[])
	{
		
		
		Studentobj sobj1=new Studentobj();
		sobj1.id=10;
		sobj1.name="Bonny";
		sobj1.displayDetails();
		
		
	}

}
