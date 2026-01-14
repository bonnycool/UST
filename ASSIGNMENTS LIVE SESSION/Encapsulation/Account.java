package Encapsulation;
import java.util.Scanner;
public class Account {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		AtmAccount atm1=new AtmAccount();
		
		atm1.setPin(sc.nextLine());
		atm1.setBalance(sc.nextFloat());
		
		System.out.println("Pin is :"+atm1.getPin());
		atm1.withdraw(sc.nextFloat());

	}

}
