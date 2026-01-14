package object;

public class PersonObj {
	
	String name;
	int age;
	PersonObj(){
		this.name="Unknown";
		this.age=12;
	}
	PersonObj(String name){
		this(name,12);
	}
	PersonObj(String name,int age){
		
		this.name=name;
		this.age=age;
	}
	
	void displayPerson() {
		System.out.println("Name:"+this.name);
		System.out.println("Age:"+this.age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PersonObj p1=new PersonObj("Bonny",22);
		p1.displayPerson();
		

	}

}
