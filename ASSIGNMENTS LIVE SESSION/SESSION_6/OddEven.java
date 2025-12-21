package SESSION_6;
import java.util.Scanner;
public class OddEven {

	static void Even(int x)
	{
		if(x%2==0)
			System.out.println("Number is even");
		
	}
	
	static void Odd(int x) {
		if(x%2!=0)
			System.out.println("Number is odd");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		Even(a);
		Odd(a);
		

	}

}
