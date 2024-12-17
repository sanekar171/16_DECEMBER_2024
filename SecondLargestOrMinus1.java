public class SecondLargestOrMinus1 {
    /**
     * You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.
     *
     *
     * Problem Constraints
     *
     * 1 <= |A| <= 105
     *
     *
     * 0 <= A[i] <= 109
     *
     *
     *
     *
     *
     * Input Format
     *
     * The first argument is an integer array A.
     *
     *
     *
     *
     *
     * Output Format
     *
     * Return the second largest element. If no such element exist then return -1.
     *
     *
     *
     * Example Input
     *
     * Input 1:
     *
     *  A = [2, 1, 2]
     * Input 2:
     *
     *  A = [2]
     *
     *
     * Example Output
     *
     * Output 1:
     *
     *  1
     * Output 2:
     *
     *  -1
     *
     *
     * Example Explanation
     *
     * Explanation 1:
     *
     *  First largest element = 2
     *  Second largest element = 1
     * Explanation 2:
     *
     *  There is no second largest element in the array.
     *
     *
     *
     * Expected Output
     * Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
     * Arg 1: An Integer Array, For e.g [1,2,3]
     * Enter Input Here
      */
    public static void main(String[] args) {
        int []A={2,1,2};
        SecondLargestOrMinus1 secondLargestOrMinus1=new SecondLargestOrMinus1();
        System.out.println(secondLargestOrMinus1.solve(A));
        A=new int[]{2};
        System.out.println(secondLargestOrMinus1.solve(A));
    }

    public int solve(int[] A)
    {
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
        for(int i=0;i<=A.length-1;i++)
        {
            if(A[i]>max1)
                max1=A[i];
        }

        for(int i=0;i<=A.length-1;i++)
        {
            if(A[i]>max2 && A[i]<max1)
                max2=A[i];
        }

        if(max2==Integer.MIN_VALUE)
            return -1;
        return max2;
    }//
}
