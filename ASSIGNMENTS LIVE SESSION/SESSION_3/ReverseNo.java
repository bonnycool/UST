import java.util.Scanner;
class ReverseNo{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        
        int rem,rev=0;

        while(num>0){
            rem=num%10;//to get the last digit  
            rev=rev*10+rem;
            num=num/10;//to remove the last digit 
        }
        System.out.println("the rev of the digits ="+rev);
    
      

        

    }
}