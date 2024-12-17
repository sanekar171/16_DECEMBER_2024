import java.util.Arrays;

public class ReverseArray {
    /**
     * Problem Description
     *
     * You are given a constant array A.
     *
     * You are required to return another array which is the reversed form of the input array.
     *
     *
     *
     * Problem Constraints
     *
     * 1 <= A.size() <= 10000
     *
     * 1 <= A[i] <= 10000
     *
     *
     *
     * Input Format
     *
     * First argument is a constant array A.
     *
     *
     *
     * Output Format
     *
     * Return an integer array.
     *
     *
     *
     * Example Input
     *
     * Input 1:
     *
     * A = [1,2,3,2,1]
     * Input 2:
     *
     * A = [1,1,10]
     *
     *
     * Example Output
     *
     * Output 1:
     *
     *  [1,2,3,2,1]
     * Output 2:
     *
     *  [10,1,1]
     *
     *
     * Example Explanation
     *
     * Explanation 1:
     *
     * Reversed form of input array is same as original array
     * Explanation 2:
     *
     * Clearly, Reverse of [1,1,10] is [10,1,1]
     *
     *
     *
     * Expected Output
     * Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
     * Arg 1: An Integer Array, For e.g [1,2,3]
     * Enter Input Here
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ReverseArray().solve(new int[]{1,2,3,4,5})));
    }

    public int[] solve(final int[] A) {
        int N=A.length;
        int temp;
        for(int i=0;i<=N-1;i++)
        {
            if(i<N/2)
            {
                temp=A[i];
                A[i]=A[N-1-i];
                A[N-1-i]=temp;
            }
        }
        return A;
    }//method
}
