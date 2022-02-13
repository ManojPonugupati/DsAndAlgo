package heaps;

import javafx.util.Pair;
import utils.PairInt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinimumLargestElement {
    /*
    Problem Description

    Given an array A of N numbers, you have to perform B operations. In each operation, you have to pick any one of the N elements and add original value(value stored at index before we did any operations) to it's current value. You can choose any of the N elements in each operation.

    Perform B operations in such a way that the largest element of the modified array(after B operations) is minimised. Find the minimum possible largest element after B operations.



            Problem Constraints

1 <= N <= 106
            0 <= B <= 105
            -105 <= A[i] <= 105



    Input Format

    First argument is an integer array A.
    Second argument is an integer B.



    Output Format

    Return an integer denoting the minimum possible largest element after B operations.



    Example Input

    Input 1:

    A = [1, 2, 3, 4]
    B = 3
    Input 2:

    A = [5, 1, 4, 2]
    B = 5


    Example Output

    Output 1:

            4
    Output 2:

            5


    Example Explanation

    Explanation 1:

    Apply operation on element at index 0, the array would change to [2, 2, 3, 4]
    Apply operation on element at index 0, the array would change to [3, 2, 3, 4]
    Apply operation on element at index 0, the array would change to [4, 2, 3, 4]
    Minimum possible largest element after 3 operations is 4.
    Explanation 2:

    Apply operation on element at index 1, the array would change to [5, 2, 4, 2]
    Apply operation on element at index 1, the array would change to [5, 3, 4, 2]
    Apply operation on element at index 1, the array would change to [5, 4, 4, 2]
    Apply operation on element at index 1, the array would change to [5, 5, 4, 2]
    Apply operation on element at index 3, the array would change to [5, 5, 4, 4]
    Minimum possible largest element after 5 operations is 5.
*/
public static void main(String[] args) {
    int[] A = {8,6,4,2};
    int B=8;
    PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)->a[0]-b[0]);
    int[] c_state = new int[A.length];
    for(int i=0;i<A.length;i++){
        int a =A[i];
        c_state[i]=a;
    }

    for(int i=0;i<A.length;i++){
        int[] x = new int[2];
        x[0] = 2*A[i];
        x[1]=i;
        minHeap.add(x);
    }

    while(B-- > 0){
        int[] heap = minHeap.poll();
        int idx= heap[1];
        c_state[idx] += A[idx];
        heap[0] += A[idx];
        minHeap.add(heap);
    }
    int max=Integer.MIN_VALUE;
    for(int i=0;i<A.length;i++){
        max = Math.max(max,c_state[i]);
    }
    System.out.println(max);
}
}
