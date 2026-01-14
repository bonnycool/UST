package Encapsulation;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDetails Accdet1=new AccountDetails();
		
		Accdet1.setBalance(-313);
		Accdet1.setAccountNumber(15780002001124L);
		
		System.out.println("Account no ="+Accdet1.getAccountNumber());
		System.out.println("Balance ="+Accdet1.getBalance());
		

	}

}
