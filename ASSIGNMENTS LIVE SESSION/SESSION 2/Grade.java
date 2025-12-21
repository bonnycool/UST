import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int mark=sc.nextInt();
       

        if(mark>=90)
        {
            System.out.println("Grade A");
        }

        else if(mark>=75)
        {
            System.out.println("Grade B");
        }
        else if(mark>=60)
        {
             System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }
}
}