package Polymorphism;

public class Payment {

	void pay(int amount){
		System.out.println("Amount is "+amount);
	}
	void pay(int amount,String mode) {
		System.out.println("Amount:"+amount+"::Mode:"+mode);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payment p1=new Payment();
		p1.pay(10000);
		p1.pay(123444, "IMPS");

	}

}
