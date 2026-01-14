package object;

public class Order {

	int orderId;
	String customerName;
	float amount;
	boolean isPremium;
	double tax;
	
	Order(int orderId,String customerName,float amount){
		this.orderId=orderId;
		this.customerName=customerName;
		this.amount=amount;
		
		if(amount<1000)
		{
			this.tax=0.1*amount;
		}
		else {
			this.tax=0.2*amount;
		}
	}
	Order(int orderId,String customerName,float amount,boolean isPremium){
		this.orderId=orderId;
		this.customerName=customerName;
		this.amount=amount;
		this.isPremium=isPremium;
		
		
		if(isPremium) {
		this.tax=0.4*amount;
		}
		else {
			this.tax=0.2*amount;
		}
	}

	
	void displayOrder() {
		System.out.println("Order id:"+orderId);
		System.out.println("Customer Name:"+customerName);
		System.out.println("Amount:"+amount);
		System.out.println("Tax:"+this.tax);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order o1=new Order(1,"BONNY",1000);
		o1.displayOrder();
		
		Order o2=new Order(2,"RAJ",6000,true);
		o2.displayOrder();
		
		
		

	}

}
