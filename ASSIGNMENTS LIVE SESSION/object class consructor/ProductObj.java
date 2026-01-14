package object;

public class ProductObj {
	
	int productId;
	String productName;
	float Price;
	
	ProductObj(){
		this.Price=8000;
		this.productName="Simple Product for Default";
		this.productId=10;
	}
	
	void displayProduct() {
		System.out.println("Name:"+productName);
		System.out.println("Price :"+Price);
		System.out.println("Product Id :"+productId);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductObj p1=new ProductObj();
		p1.displayProduct();

	}

}
