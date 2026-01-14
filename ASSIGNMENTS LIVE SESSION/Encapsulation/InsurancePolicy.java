package Encapsulation;
import java.util.Scanner;
public class InsurancePolicy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Policy p =new Policy();
		p.setPolicyid(sc.nextInt());
		p.calculatePremium(sc.nextInt());
		
		System.out.println("Policy id :"+p.getPolicyid());
		System.out.println("Premium amount ="+p.getPremium());
	
		

	}

}
