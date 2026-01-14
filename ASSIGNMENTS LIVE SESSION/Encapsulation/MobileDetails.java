package Encapsulation;

public class MobileDetails {

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		float GST=0.3f*price;
		return price+GST;
	}
	public void setPrice(float price) {
		this.price = price;
		
		
	}
	private String brand;
	private float price;
	
	
	
}
