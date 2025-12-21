import java.util.Scanner;

class Linear{
public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);

    System.out.println("enter the length of the array");
    int n=sc.nextInt();

    int a[]=new int[n];
    int i=0;

    while(i<n)
    {
        a[i]=sc.nextInt();
        i++;
    }

    for(int num:a)
        System.out.print(" "+num);
    System.out.println();

    System.out.println("Enter the Element to be found from the array");
    int find=sc.nextInt();

    boolean ElementFound=false;
     for(i=0;i<n;i++){
        if(find==a[i])
        {
            System.out.println("Element found at the index "+i);
            ElementFound=true;
            break;
        }
     }

     if(ElementFound){
        System.out.println("ELement founded");
     }
     else{
        System.out.println("Element not found");
     }

    
}
}