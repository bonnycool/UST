package Encapsulation;

public class AtmAccount {

	private String pin;
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		
		boolean isvalid=true;
		for(int i=0;i<pin.length();i++)
		{
			if(!Character.isDigit(pin.charAt(i)))
			{
				isvalid=false;
				break;
			}
		}
		
		
		if(pin.length()==4 && isvalid )
		{
			this.pin = pin;
			
		}
		else {
			System.out.println("Enter the 4 digit pin ");
	
		}
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public void withdraw(float amount) {
		
		if(amount<=balance)
		{
		this.balance=balance-amount;
		System.out.println("Balance after the withdrawal :"+this.balance);
		}
		
		else {
			System.out.println("Insufficient Amount");
		}
	}
	private float balance;
}
