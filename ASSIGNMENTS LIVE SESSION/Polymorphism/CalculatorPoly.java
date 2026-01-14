package Polymorphism;

public class CalculatorPoly {
	
	void add(int x,int y) {
		int sum=x+y;
		System.out.println("Sum of 2 numbers ="+sum);
		
	}
	void add(int x,int y,int z) {
		int sum=x+y+z;
		System.out.println("Sum of 3 numbers ="+sum);
		
	}
	
	double add(double x,double y) {
		double sum=x+y;
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=5;
		int c=4;
		
		double a1=4.5;
		double a2=5.4;
		CalculatorPoly obj1=new CalculatorPoly();
		
		obj1.add(a,b);
		
		CalculatorPoly obj2=new CalculatorPoly();
		
		obj2.add(a,b,c);
		System.out.println("Sum of the decimal values"+ obj2.add(a1,a2));
		
		CalculatorPoly obj3=new CalculatorPoly();
		
		
		System.out.println("Sum of the decimal values"+ obj3.add(a1,a2));
		
		
		
		
		

	}

}
