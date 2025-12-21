package SESSION_6;

import java.util.Scanner;
public class PrimeMethod {
	
	static void Prime(int x) {
		
		boolean isPrime=true;
		
		for(int i=2;i<x/2;i++)
		{
			if(x%i==0)
			{
				isPrime=false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println("Prime Number is "+x);
		}
		else {
			System.out.println("Not Prime");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		Prime(a);
	}

}
