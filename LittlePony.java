public class LittlePony {
    /**
     * Problem Description
     *
     * Little Ponny is given an array, A, of N integers. In a particular operation, he can set any element of the array equal to -1.
     *
     * He wants your help in finding out the minimum number of operations required such that the maximum element of the resulting array is B. If it is not possible, then return -1.
     *
     *
     *
     * Problem Constraints
     *
     * 1 <= |A| <= 105
     *
     * 1 <= A[i] <= 109
     *
     *
     *
     * Input Format
     *
     * The first argument of input contains an integer array, A.
     *
     * The second argument of input contains an integer, B.
     *
     *
     *
     * Output Format
     *
     * Return an integer representing the answer.
     *
     *
     *
     * Example Input
     *
     * Input 1:
     *
     *  A = [2, 4, 3, 1, 5]
     *  B = 3
     * Input 2:
     *
     *  A = [1, 4, 2]
     *  B = 3
     *
     *
     * Example Output
     *
     * Output 1:
     *
     *  2
     * Output 2:
     *
     *  -1
     *
     *
     * Example Explanation
     *
     * Explanation 1:
     *
     *  We need to remove 4 and 5 to make 3 the biggest element.
     * Explanation 2:
     *
     *  As 3 doesn't exist in the array, the answer is -1.
     *
     *
     *
     * Expected Output
     * Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
     * Arg 1: An Integer Array, For e.g [1,2,3]
     * Enter Input Here
     * Arg 2: A single Integer, For e.g 9
     * Enter Input Here
     */

    public static void main(String[] args) {
        int[]A={1,2,3,4,5};
        int B=2;
        System.out.println(new LittlePony().solve(A,B));
        B=72;
        System.out.println(new LittlePony().solve(A,B));
    }

    public int solve(int[] A, int B)
    {
        int countGreater=0;
        Boolean isFound=Boolean.FALSE;
        for(int i=0;i<=A.length-1;i++)
        {
            if(A[i]==B)
            {
                isFound=Boolean.TRUE;
            }
        }
        if(isFound)
        {
            for(int i=0;i<=A.length-1;i++)
            {
                if(A[i]>B)
                {
                    countGreater++;
                }
            }
            return countGreater;
        }
        return -1;
    }//
}
