import java.util.Scanner;

class CountEvenOdd{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array ");
        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++){

            a[i]=sc.nextInt();
        }


        for(int num:a)
        System.out.print(" "+num);

        int Even=0;
        int Odd=0;

        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0){
            Even++;
            }
    
            else{
            Odd++;
        }
        }
        System.out.println();
        System.out.println("Number of Even Elements in the array ="+Even);

        System.out.println("Number of Odd elements in the array ="+Odd);

    }
}