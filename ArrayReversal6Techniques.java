import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayReversal6Techniques {
    public static void main(String[] args) {
        int[]A={1,2,3,4,5,6};
        int B[]={1,2,3,4,5};

        ArrayReversal6Techniques arrayReversal6Techniques=new ArrayReversal6Techniques();


        arrayReversal6Techniques.reverse2(A);
        arrayReversal6Techniques.reverse4(A);
        arrayReversal6Techniques.reverse3(A);//investigate why this shows wrong
        arrayReversal6Techniques.reverse1(A);
        arrayReversal6Techniques.reverse5(A);


    }

    void reverse1(final int[]A)
    {
        //2 pointers
        //new Array
        //TC O(N)
        //SC O(N)
        int N=A.length;
        int[]Rev=new int[A.length];

        for(int i=0,j=N-1; i<=N-1 && j>=0 ; i++, j--)
        {
            Rev[i]=A[j];
        }
        System.out.println("REVERSED1="+ Arrays.toString(Rev));
    }//

    void reverse2(final int[]A)
    {
        //1 pointer
        //new Array
        //TC O(N)
        //SC O(N)
        int N=A.length;
        int[]Rev=new int[A.length];

        for(int i=0;i<=N-1;i++)
        {
            Rev[i]=A[N-1-i];
        }
        System.out.println("REVERSED2="+Arrays.toString(Rev));
    }//

    void reverse3(final int[]A)
    {
        //2 pointers
        //same array
        //inplace needs i<j and i<N/2
        //separate array does not need them
        //TC O(N)
        //SC O(1)
        int N=A.length;
        int temp;
        for(int i=0,j=N-1; i<=N-1 && j>=0 ; i++, j--)
        {
            if(i<j)//extremely vital ONLY for in-place it is needed, not for new array
            {
                temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }
        }
        System.out.println("REVERSED3="+Arrays.toString(A));
    }//

    void reverse4(final int[] A)
    {
        //1 pointer
        //in-place
        //in-place needs i<j and i<N/2 conditions
        //separate array does not need them
        //TC O(N)
        //SC O(1)
        int N=A.length;
        int temp;
        for(int i=0;i<=N-1;i++)
        {
            if(i<N/2)//extremely vital-required ONLY for in-place, NOT required for separate array
            {
                temp=A[i];
                A[i]=A[N-1-i];
                A[N-1-i]=temp;
            }
        }
        System.out.println("REVERSED4="+Arrays.toString(A));
    }//

    void reverse5(final int[]A)
    {
        ArrayList<Integer>Ar=new ArrayList<>();
        for(int temp:A)
        {
            Ar.add(temp);
        }
        Collections.reverse(Ar);
        System.out.println("REVERSED5="+Ar);
    }
}//class