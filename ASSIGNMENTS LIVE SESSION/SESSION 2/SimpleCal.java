import java.util.Scanner;
public class SimpleCal {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        



        while(true){
            System.out.println("Enter the  numbers a and b ");
            int a = sc.nextInt();
            int b=sc.nextInt();

            System.out.println("enter your choice");
            int choice=sc.nextInt();
        switch (choice) {
        
            case 1:
                int sum=a+b;
                System.out.println("Sum of the two num is "+sum);
                break;
            case 2:
                int  sub=a-b;
                System.out.println("Sub of the two num is "+sub);
                break;

            case 3:
                int mul=a*b;
                System.out.println("Mul of the two num is "+mul);
                break;
               
            case 4:
                double div=(double)a/b;
                System.out.println("Div of the two num is "+div);    

            default:System.out.println("Invlalid chocice");
                break;
        }

        if(choice==5){
            break;
        }
    }
    }
}
