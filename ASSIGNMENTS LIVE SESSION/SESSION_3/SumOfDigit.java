import java.util.Scanner;
class SumOfDigit{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        
        int rem,sum=0;

        while(num>0){
            rem=num%10;//to get the last digit  
            sum+=rem;
            num=num/10;//to remove the last digit 
        }
        System.out.println("the sum of the digits ="+sum);
    
      

        

    }
}