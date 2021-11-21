package stacks;

import java.util.Stack;

public class MaxXOROfMaxAndSecondMaxOfSubArrays {
    public static void main(String[] args) {
        int[] A = {2, 3, 1, 4};
        Stack<Integer> monotonicStack = new Stack<>();
        int ans=0;
        for(int i=0;i<A.length;i++){
            while(!monotonicStack.isEmpty()){
                ans = Math.max(ans,monotonicStack.peek()^A[i]);
                if(monotonicStack.peek() < A[i])
                  monotonicStack.pop();
                else break;
            }
            monotonicStack.push(A[i]);
        }
        System.out.println(ans);
    }
}
