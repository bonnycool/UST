package Encapsulation;

public class AccountDetails {
	
	private long AccountNumber;
	public long getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		AccountNumber = accountNumber;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		if(balance<0) {
			this.balance=0;
		}
		else {
			
		this.balance = balance;
		}
	}
	private long balance;
	
	
	

}
