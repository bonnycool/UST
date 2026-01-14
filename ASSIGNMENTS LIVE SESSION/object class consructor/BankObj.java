package object;
import java.util.Scanner;

public class BankObj {

	long AccountNo;
	String holderName;
	double balance;
	
	BankObj(long AccountNo,String holderName,double balance){
		this.AccountNo=AccountNo;
		this.holderName=holderName;
		this.balance=balance;
	}
	
	void showAccount() {
		System.out.println("Account Holder Name :"+holderName);
		System.out.println("Account Number :"+AccountNo);
		System.out.println("Balance :"+balance);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Account Details:");
		
		System.out.println("Enter the Account no:");
		long a=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the Account Holder Name:");
		String n=sc.nextLine();
		
		System.out.println("Enter the Balance");
		double b=sc.nextDouble();
		
		BankObj b1=new BankObj(a,n,b);
		b1.showAccount();
		
		sc.close();
	}

}
