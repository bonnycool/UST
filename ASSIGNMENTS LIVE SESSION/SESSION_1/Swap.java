//Assignment 2

class Swap {
    
        public static void main(String args[])
        {
            int a=10;
            int b=20;

            int temp=b;
            b=a;
            a=temp;

            System.out.println("a is "+a);
            System.out.println("b is "+b);

            a=10;
            b=20;
            a=a+b;
            b=a-b;
            a=a-b;

            System.out.println("Without the temp a is "+a);
             System.out.println("Without the temp b is "+b);

        }
    
}
