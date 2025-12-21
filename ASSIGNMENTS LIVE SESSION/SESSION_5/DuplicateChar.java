import java.util.Scanner;
public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		char  ch;
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if (ch==' ')
			{
				continue;
			}
			
			for(int j=i+1;j<s.length();j++)
			{
			
				if(ch==s.charAt(j))
				{
					System.out.println("Duplicatee character"+ch);
					break;
				}
			}
		}

	}

}
