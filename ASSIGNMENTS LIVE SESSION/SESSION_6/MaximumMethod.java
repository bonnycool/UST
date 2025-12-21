package SESSION_6;
import java .util.Scanner;
public class MaximumMethod {

	
	static void Max(int x,int y) {
		
		if(x>y) {
			System.out.println(x+"is Greater");
		}
		else {
			System.out.println(y+"is Greater");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		Max(a,b);
		

	}

}
