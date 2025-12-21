class SumAndAvg{
    public static void main(String[] args) {
        
        int array[]={1,2,3,4,5,7};
        int sum=0;
        double avg;
        for(int num:array)
        sum+=num;

        System.out.println("Sum of the array is "+sum);

        avg=(double)sum/array.length;

        System.out.println("Avg of the array is "+avg);
    }
}