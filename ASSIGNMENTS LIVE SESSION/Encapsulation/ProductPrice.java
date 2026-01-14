package Encapsulation;

public class ProductPrice {
	
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		
		if(price<=100000 && price>=100)
		{
		this.price = price;
		}
		else {
			this.price=200;
			System.out.println("Default price");
		}
		
		}

	private float price;

}
