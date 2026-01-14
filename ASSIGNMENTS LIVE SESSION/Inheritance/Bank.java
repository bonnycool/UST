package Inheritance;

class Bankrate{
	float interestRate;
}
class Savings extends Bankrate{
	float balance;
	void  calculateintertest() {
		
		float interest=balance*interestRate;
		System.out.println("Interest is "+interest);
		
	}
}

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Savings s1=new Savings();
		s1.interestRate=0.3f;
		s1.balance=1000;
		s1.calculateintertest();

	}

}
