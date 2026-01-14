package object;

public class MobileObj {
	
	String brand;
	float ram;
	float storage;
	float price;
	
	MobileObj(){
	System.out.println("This  is the empty constructor");
		
	}
	MobileObj(String brand){
		this(brand,6,128,10000);
		
		
		
	}
	MobileObj(String brand,float ram){
		this(brand,ram,128,12000);
		
	}
	MobileObj(String brand,float ram,float storage){
		this(brand,ram,storage,14000);
		
		
		
	}
	
	MobileObj(String brand,float ram,float storage,float price){
		this.brand=brand;
		this.ram=ram;
		this.storage=storage;
		this.price=price;
		
		
	}
	
	void mobileConfiguration() {
		System.out.println("Brand:"+brand);
		System.out.println("Ram :"+ram);
		System.out.println("Storage:"+storage);
		System.out.println("Price:"+price);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MobileObj  mobile1=new MobileObj("Samsung");
		mobile1.mobileConfiguration();
		
		MobileObj  mobile2=new MobileObj("Samsung",8);
		mobile2.mobileConfiguration();
		
		
		MobileObj  mobile3=new MobileObj("Oneplus",8,256);
		mobile3.mobileConfiguration();
		
		MobileObj  mobile4=new MobileObj("Apple",8,256,100000);
		mobile4.mobileConfiguration();
	

	}

}
