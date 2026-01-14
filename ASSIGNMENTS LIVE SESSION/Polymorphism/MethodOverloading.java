package Polymorphism;
class Operation{
//	public void abc() {
//		System.out.println(10+20);
//		
//	}
//	public void display() {
//		System.out.println(10+20);
//	}
	public void add() { //no Passing parameter
		System.out.println(10+20);
	}
	
	public void add(int x) { //Passing 1st para 
		System.out.println(x+20);
	}
	
	public void add(int x,int y) { //Passing 1st para 
		System.out.println(x+y);
	}
	
	
	
}
public class MethodOverloading {

	public static void main(String[] args) {
		
		Operation op =new Operation();
		int a=1;
		op.add(a);
		// TODO Auto-generated method stub

	}

}
