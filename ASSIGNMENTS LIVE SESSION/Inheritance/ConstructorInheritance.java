package Inheritance;
class Person{
	String name;
	Person(String name){
		System.out.println("This is the person constructor");
		this.name=name;
		
		
	}
}

class student extends Person{
	int rollNo;
	student(){
		super("Bonny");
		System.out.println("This is the Student constructor");
		this.rollNo=10;
	}
	void display() {
		System.out.println("this is the name:"+name);
		System.out.println("this is the roll no"+rollNo);
	}

}



public class ConstructorInheritance {
	
	public  static void  main(String args[])
	{
		student s1=new student();
		s1.display();
	}

}
