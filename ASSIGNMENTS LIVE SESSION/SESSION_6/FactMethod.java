package SESSION_6;

import java.util.Scanner;
public class FactMethod {

	static void Fact(int x)
	{
		int fact=1;
		
		for(int i=1;i<=x;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("Factorial of the number is "+fact);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		Fact(a);
		

	}

}

