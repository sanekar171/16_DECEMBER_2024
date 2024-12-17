import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ElementPresentInArrayTestcases {
    /**
     * Problem Description
     *
     * You are given an integer T (number of test cases). You are given array A and an integer B for each test case. You have to tell whether B is present in array A or not.
     *
     * Problem Constraints
     *
     * 1 <= T <= 10
     * 1 <= A <= 105
     * 1 <= A[i], B <= 109
     *
     *
     * Input Format
     *
     * First line of the input contains number of test cases as single integer T .
     * Next, each of the test case consists of 3 lines:
     *
     * First line contains a single integer A denoting the length of array
     * Second line contains A integers denoting the array elements
     * Third line contains a single integer B
     *
     *
     * Output Format
     *
     * For each test case, print on a separate line 1 if the element exists, else print 0.
     *
     *
     *
     * Example Input
     *
     * Input 1:
     *
     *
     *
     *
     *  1
     *  5
     *  4 1 5 9 1
     *  5
     * Input 2:
     *
     *  1
     *  3
     *  7 7 2
     *  1
     *
     *
     *
     *
     *
     * Example Output
     *
     * Output 1:
     *
     *
     *
     *
     *  1
     * Output 2:
     *
     *  0
     *
     *
     *
     *
     *
     * Example Explanation
     *
     * Explanation 1:
     *
     *
     *
     *
     *   B = 5  is present at position 3 in A
     * Explanation 2:
     *
     *   B = 1  is not present in A.
     */
    public static void main(String[] args)throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Integer T=null;
        Integer N=null;
        int[]A=null;
        Integer B=null;
        Boolean isFound=null;
        T=Integer.parseInt(br.readLine());
        String[] elements=null;
        for(int i=1;i<=T;i++)
        {
            isFound=Boolean.FALSE;
            N=Integer.parseInt(br.readLine());
            A=new int[N];
            elements=br.readLine().split("\\s");
            for(int j=0;j<=N-1;j++)
            {
                A[j]=Integer.parseInt(elements[j]);
            }
            B=Integer.parseInt(br.readLine());

            for(int j=0;j<=N-1;j++)
            {
                if(A[j]==B)
                {
                    isFound = Boolean.TRUE;
                    break;
                }
            }
            if(!isFound)
                System.out.println(0);
            else
                System.out.println(1);
        }
    }
}
