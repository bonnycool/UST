package Encapsulation;
import java.util.Scanner;;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		CustomerProfle c1=new CustomerProfle();
		
		String name=sc.nextLine();
		
		
	
		
		c1.setName(name);
		c1.setAge(sc.nextInt());
		
		System.out.println(c1.getName());
		System.out.println(c1.getAge());

	}

}
