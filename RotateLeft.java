import java.util.Arrays;

public class RotateLeft {
    public static void main(String[] args) {
        int[]A={1,2,3,4,5};
        RotateLeft rotateLeft=new RotateLeft();
        rotateLeft.RotateLeft(A,2);
        rotateLeft.RotateLeft1(A,2);
    }

    void RotateLeft(final int[]A,int B)
    {
        int N=A.length;
        B=B%N;
        int[]T=new int[N];
        for(int i=0;i<=B;i++)
        {
            T[i]=A[i+B];
        }
        for(int i=B+1;i<+N-1;i++)
        {
            T[i]=A[i-B-1];
        }
        System.out.println(Arrays.toString(T));
    }

    void RotateLeft1(final int[]A,int B){
        int N=A.length;
        int temp;

        for(int i=0,j=B-1;i<=B-1 && j>=0;i++,j--)
        {
            if(i<j)
            {
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }//

        for(int i=B,j=N-1;i<=N-1 &&j>=0; i++,j--)
        {
            if(i<j)
            {
                temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }
        }//

        for(int i=0,j=N-1;i<=N-1&&j>=0;i++,j--)
        {
            if(i<j)
            {
                temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }
        }//

        System.out.println(Arrays.toString(A));
    }//method

}
