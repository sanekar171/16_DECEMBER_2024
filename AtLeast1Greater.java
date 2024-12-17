public class AtLeast1Greater {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6,7,8,9};
        AtLeast1Greater atLeast1Greater=new AtLeast1Greater();
        atLeast1Greater.count1(A);
        atLeast1Greater.count2(A);
    }

    void count1(final int A[]){
        //find max1
        int count=0;
        int max1=Integer.MIN_VALUE;
        for(int i=0;i<=A.length-1;i++)
        {
            if(A[i]>max1)
                max1=A[i];
        }
        //find occurrences of elements < max1
        for(int i=0;i<=A.length-1;i++)
        {
            if(A[i]<max1)
                count++;
        }
        System.out.println("COUNT1="+count);
    }//

    void count2(final int A[])
    {
        Boolean isLGreater=null;
        Boolean isRGreater=null;
        Integer greatCount=0;

        L1:for(int i=0;i<=A.length-1;i++)
        {
            isLGreater=Boolean.FALSE;
            isRGreater=Boolean.FALSE;

            if(i>0)
                L2:for(int j=0;j<=i-1;j++)
                {
                    if(A[j]>A[i])
                    {
                        isLGreater=Boolean.TRUE;
                        break L2;
                    }
                }
            if(i<A.length-1)
                L3:for(int j=i+1;j<=A.length-1;j++)
                {
                    if (A[j] > A[i])
                    {
                        isRGreater=Boolean.TRUE;
                        break L3;
                    }
                }
            if(isLGreater || isRGreater)
                greatCount++;
        }
        System.out.println("COUNT2="+greatCount);
    }//
}//class
