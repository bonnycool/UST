import java.util.Scanner;

class LargeSmall{

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

        int large=a[0];
        int small=a[0];

        for(int i=1;i<n;i++)
        {
            if(large>a[i])
            large=a[i];
    
            if(small<a[i])
            small=a[i];
        }
        System.out.println();
        System.out.println("Smallest element in the array ="+small);

        System.out.println("Largest element in the array ="+large);

    }
}