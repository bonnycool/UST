import java.util.Scanner;
public class UpperLowerCase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		
		System.out.println(s);
		
		String Lower=new String(s.toLowerCase());
		System.out.println("Lower Case="+Lower);
		
		System.out.println("Upper Case="+s.toUpperCase());
	}
}
