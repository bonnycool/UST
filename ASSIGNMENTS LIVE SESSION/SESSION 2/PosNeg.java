//Assigment 6
import java.util.Scanner;
public class PosNeg {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        if(a==0)
        {
            System.out.println("Number is Zero");
        }
        else if (a>0) {

            System.out.println("Number is Positive");
            
        }
        else{
            System.out.println("Number is Negative");
        }
    }
    
}
