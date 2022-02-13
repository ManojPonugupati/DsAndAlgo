package heaps;

import java.util.PriorityQueue;

public class KPlacesApart {
/*
    Problem Description

    Given N persons with different priorities standing in a queue.

    Queue is following a property that Each person is standing atmost B places away from it's sorted position.

    Your task is to sort the queue in the increasing order of priorities.

            NOTE:

    No two persons can have the same priority.
    Use the property of the queue to sort the queue with complexity O(NlogB).


    Problem Constraints

1 <= N <= 100000
            0 <= B <= N



    Input Format

    First argument is an integer array A representing the priorities of N persons.
    Second argument is an integer B.



    Output Format

    Return an integer array representing the sorted queue.



    Example Input

    Input 1:

    A = [1, 40, 2, 3]
    B = 2
    Input 2:

    A = [2, 1, 17, 10, 21, 95]
    B = 1


    Example Output

    Output 1:

            [1, 2, 3, 40]
    Output 2:

            [1, 2, 10, 17, 21, 95]


    Example Explanation

    Explanation 1:

    Given array A = [1, 40, 2, 3]
    After sorting, A = [1, 2, 3, 40].
    We can see that difference between initial position of elements amd the final position <= 2.
    Explanation 2:

    After sorting, the array becomes [1, 2, 10, 17, 21, 95].

*/
public static void main(String[] args) {
    int[] A = {6, 5, 3, 2, 1, 10};
    int B=3;
    int[] out = new int[A.length];
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    for(int i=0;i<B;i++){
        minHeap.add(A[i]);
    }
    int k=0;
    for(int i=B;i<A.length;i++){
        minHeap.add(A[i]);
        k=i-B;
        out[k] = minHeap.poll();
    }
    while (minHeap.size()>0){
        out[++k]=minHeap.poll();
    }
    for(int i=0;i<A.length;i++){
        System.out.print(out[i] + " ");
    }
}
}
