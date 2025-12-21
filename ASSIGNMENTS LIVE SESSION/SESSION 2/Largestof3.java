
import java.util.Scanner;
public class Largestof3 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>=b && a>=c)
        {
            System.out.println(a+"a is greater");
        }

        else if(b>=a && b>=c)
        {
            System.out.println(b+"b is greater");
        }
        else
        {
             System.out.println(c+"c is greater");
        }

    }
    
}
