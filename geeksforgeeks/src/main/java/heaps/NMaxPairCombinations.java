package heaps;

import java.util.Arrays;
import java.util.PriorityQueue;

public class NMaxPairCombinations {

/*
    Problem Description

    Given two integers arrays A and B of size N each.

    Find the maximum N elements from the sum combinations (Ai + Bj) formed from elements in array A and B.



    Problem Constraints

1 <= N <= 2 * 105

            -1000 <= A[i], B[i] <= 1000



    Input Format

    First argument is an integer array A.
    Second argument is an integer array B.



            Output Format

    Return an intger array denoting the N maximum element in descending order.



    Example Input

    Input 1:

    A = [1, 4, 2, 3]
    B = [2, 5, 1, 6]
    Input 2:

    A = [2, 4, 1, 1]
    B = [-2, -3, 2, 4]


    Example Output

    Output 1:

            [10, 9, 9, 8]
    Output 2:

            [8, 6, 6, 5]


    Example Explanation

    Explanation 1:

            4 maximum elements are 10(6+4), 9(6+3), 9(5+4), 8(6+2).
    Explanation 2:

            4 maximum elements are 8(4+4), 6(4+2), 6(4+2), 5(4+1).
*/

    public static void main(String[] args) {
      int[] A = {1,4,2,3};
      int[] B = {2,5,1,6};
      Arrays.sort(A);
      Arrays.sort(B);
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b)->a[0]-b[0]);
        

    }
}
