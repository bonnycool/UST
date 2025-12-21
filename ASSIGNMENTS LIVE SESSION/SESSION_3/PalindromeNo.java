import java.util.Scanner;
class PalindromeNo{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        
        int orginal=num;

        int rem,rev=0;

        while(num>0){
            rem=num%10;//to get the last digit  
            rev=rev*10+rem;
            num=num/10;//to remove the last digit 
        }
        if(orginal==rev)
        System.out.println("Number  is Palindrome");
    else
        System.out.println("Not Palindrome");
    
    }
}