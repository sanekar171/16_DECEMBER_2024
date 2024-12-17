import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RotateRight {
    public static void main(String[] args) {
        int[]A={1,2,3,4,5};
        RotateRight rotateRight=new RotateRight();
        rotateRight.RotateRight(A,2);
        rotateRight.RotateRight2(A,2);
    }

    void RotateRight(final int[]A,int K)
    {
        int N=A.length;
        K=K%N;

        int T[]=new int[N];

        for(int i=0;i<=K-1;i++)
        {
            T[i]=A[i+K+1];
        }
        for(int i=K;i<=N-1;i++)
        {
            T[i]=A[i-K];
        }
        System.out.println(Arrays.toString(T));
    }

    void RotateRight2( int[]A,int K)
    {
        int N=A.length;
        A=rotate(A,0,N-1-K);
        A=rotate(A,N-K,N-1);
        A=rotate(A,0,N-1);
        System.out.println(Arrays.toString(A));
    }

    int[] rotate(int[]A,int start,int end)
    {
        int temp;
        for(int i=start,j=end;i<j;i++,j--)
        {
         temp=A[i];
         A[i]=A[j];
         A[j]=temp;
        }
        return A;
    }

}


class Main2
{
    public static void main(String[]values)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[]inputs=br.readLine().split("\\s");
        int N=Integer.parseInt(inputs[0]);
        int[]A=new int[N];
        for(int i=0;i<=N-1;i++)
        {
            A[i]=Integer.parseInt(inputs[i+1]);
        }
        int B=Integer.parseInt(br.readLine());
        B=B%N;
        A=reverse(A,0,N-B-1);
        A=reverse(A,N-B,N-1);
        A=reverse(A,0,N-1);

        for(int i=0;i<=A.length-1;i++)
        {
            System.out.print(A[i]+" ");
        }

        System.out.println();

    }

    public static int[] reverse(int[]A,int start,int end)
    {
        int temp;
        for(int i=start,j=end;i<j;i++,j--)
        {
            temp=A[i];
            A[i]=A[j];
            A[j]=temp;
        }
        return A;
    }
}