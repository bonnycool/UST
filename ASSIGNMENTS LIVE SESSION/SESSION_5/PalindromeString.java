import java.util.Scanner;
public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  String");
		String a=sc.nextLine();
		int j=a.length()-1;
		boolean isPalindrome=true;
		for(int i=0;i<a.length()/2;i++,j--)
		{
			
			if(a.charAt(i)==(a.charAt(j)))
			{
				isPalindrome=true;
			}
			else {
				isPalindrome=false;
				break;
			}
		}
		
		if(isPalindrome)
		{
		System.out.println("Given String is palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
