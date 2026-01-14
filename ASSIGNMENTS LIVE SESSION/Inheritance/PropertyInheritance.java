package Inheritance;

class Vehicle{
	int speed;
	
}

class Car extends Vehicle{
	String brand;
	
}

public class PropertyInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1=new Car();
		c1.brand="HONDA";
		System.out.println("car brand is "+c1.brand);
		

	}

}
