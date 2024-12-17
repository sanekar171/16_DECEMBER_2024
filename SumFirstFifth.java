public class SumFirstFifth {
    public static void main(String[] args) {
        int[]A={1,2,3,4,5,6,7,8,9};
        SumFirstFifth sumFirstFifth=new SumFirstFifth();
        sumFirstFifth.sum1(A);
        sumFirstFifth.sum2(A);
        sumFirstFifth.sum3(A);
    }

    void sum1(final int[]A){
        //iterate only from first to fifth
        //TC=O(1)
        int sum=0;
        for(int i=0;i<=4;i++)
        {
            if(i==0 || i==4)
                sum+=A[i];
            //below is optional/redundant
            else
                continue;
        }
        System.out.println("SUM1="+sum);
    }//

    void sum2(final int[]A){
        //iterate over entire array
        //TC=O(N)
        int sum=0;
        for(int i=0;i<=A.length-1;i++)
        {
            if(i==0 || i==4)
                sum+=A[i];
            else
                continue;
            //else continue is redundant;
        }
        System.out.println("SUM2="+sum);
    }

    void sum3(final int[]A)
    {
        //TC for all is O(1)
        //below gives SUM15
        System.out.println("SUM3="+A[0]+A[4]);
        //bracket matters below
        System.out.println("SUM3="+(A[0]+A[4]));
    }
}
