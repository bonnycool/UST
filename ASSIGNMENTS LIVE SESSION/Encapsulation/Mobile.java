package Encapsulation;
import java.util.Scanner;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		MobileDetails md1=new MobileDetails();
		
		md1.setBrand(sc.nextLine());
		md1.setPrice(sc.nextFloat());
		
		System.out.println("Brand :"+md1.getBrand());
		System.out.println("Price with Gst:"+md1.getPrice());

	}

}
