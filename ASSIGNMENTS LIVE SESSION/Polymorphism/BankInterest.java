package Polymorphism;


class Bank{
	void getInterestRate() {
		System.out.println("Standard interest rate is 3 %");
	}
}

class SBI extends Bank{
	void getInterestRate() {
		System.out.println("SBI Standard interest rate is 2 %");
	}
}

class HDFC extends Bank{
	void getInterestRate() {
		System.out.println("HDFC Standard interest rate is 3.5 %");
	}
}
public class BankInterest {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b1=new SBI();
		b1.getInterestRate();
		Bank b2=new HDFC();
		b2.getInterestRate();

	}

}
