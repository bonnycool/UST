package Inheritance;


class Emp{
	float salary;
	
}

class Manager extends Emp{
	float bonus;
	
	float total() {
		return salary+bonus;
	}
}

public class Reuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m1=new Manager();
		m1.salary=20000;
		m1.bonus=2000;
		
		Manager m2=new Manager();
		
		m2.salary=20000;
		m2.bonus=3000;
		
		
		System.out.println("Manager 1 :"+m1.total());
		System.out.println("Manager 2 :"+m2.total());
		
		
		
		
	}

}
