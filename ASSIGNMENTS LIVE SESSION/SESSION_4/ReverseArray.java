import java.util.Scanner;

class ReverseArray{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int rev[]=new int[n];

        for(int i=0;i<n;i++){

            a[i]=sc.nextInt();
        }


       
        int j=0;

        for(int i=n-1;i>=0;i--)
        {
          
           
           rev[j]=a[i];
           j++;
            
        }

         for(int num:rev)
        System.out.print(" "+num);

       
    }
}