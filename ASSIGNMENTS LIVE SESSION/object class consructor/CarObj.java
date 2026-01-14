package object;



public class CarObj {
	
	String brand;
	String model;
	float price;
	
	CarObj(String brand,String model,float price){
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	
	void DisplayDetails() {
		System.out.println("Brand :"+brand);
		System.out.println("Model :"+model);
		System.out.println("Price :"+price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarObj car1=new CarObj("Honda","Base",100000);
		
		CarObj car2=new CarObj("Honda","Premium",200000);
		
		car1.DisplayDetails();
		car2.DisplayDetails();
		
		

	}

}
