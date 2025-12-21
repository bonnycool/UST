//Assignment 1

import java.util.Scanner;

class TwoIntegers{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int sum=a+b;
        System.out.println("Sum of the Two Numbers is"+sum );

        int Sub=a-b;
        System.out.println("Sub of the Two Numbers is"+Sub );

        int mul=a*b;
        System.out.println("Mulitplication of the Two Numbers is"+mul );

        int quotient=a/b;
        System.out.println("Quotient of the Two Numbers is"+quotient );

        
    }
}