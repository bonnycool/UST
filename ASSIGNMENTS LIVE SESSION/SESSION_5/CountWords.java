import java.util.Scanner;
public class CountWords {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		
		
		String []word=str.split("\\s+");//any whitespace or tab
		
		for(String words:word)
		System.out.println(words);
		
		System.out.println(word.length);
			
	}
}
