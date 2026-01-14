package Polymorphism;

public class Print {
	
	void print(int x) {
		System.out.println("Printing int "+x);
	}
	void print(String x) {
		System.out.println("Printing String "+x);
	}
	
	void print(int x,String y) {
		System.out.println("Printing both :"+x+""+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print p1=new Print();
		p1.print(12);
		p1.print("Bonny");
		p1.print(22, "Bonny");
	}

}
