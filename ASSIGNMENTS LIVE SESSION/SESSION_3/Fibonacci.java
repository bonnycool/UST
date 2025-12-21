import java.util.Scanner;
class Fibonacci{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit  ");
        int num=sc.nextInt();
        
    

        int first=0,next=0,second=1;
        

        while(next<num){
            System.out.print(next+" ");
            
            first=second;
            second=next;
            next=first+second;
        }
       
    }
}