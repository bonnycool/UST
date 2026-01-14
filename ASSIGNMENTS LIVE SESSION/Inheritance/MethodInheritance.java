package Inheritance;

class Animal {
	void eat(){
		System.out.println("The Animal is eating");
	}
}

class Dog extends Animal  {
	void bark() {
		
		System.out.println("Dog is Barking");
		
	}
}

public class MethodInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d1=new Dog();
		
		d1.bark();
		d1.eat();
		

	}

}
