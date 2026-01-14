package Polymorphism;
import java.util.Scanner;
public class Area {

	void area(int square) {
		
		System.out.println("Sides of the square is "+square*square);
		
	}
	
	void area(int length,int breadth) {
		System.out.println("The area of the rectangle ="+length*breadth);
	}
	
	void area(double radius) {
		System.out.println("the radius of the circle="+radius*3.14*radius);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int lenght=sc.nextInt();
		int breadth=sc.nextInt();
		
		double radius=sc.nextDouble();
		int side=4;
		
		Area a1=new Area();
		a1.area(radius);
		a1.area(side);
		a1.area(lenght, breadth);
		
		
		

	}

}
