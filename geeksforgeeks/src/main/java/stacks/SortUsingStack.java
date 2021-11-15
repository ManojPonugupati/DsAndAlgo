package stacks;

import java.util.Stack;

public class SortUsingStack {
    public static void main(String[] args) {
        int[] A = {5,4,3,2,1};
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        stack.push(A[0]);
        for(int i=1;i<A.length;i++){
            while( stack.size() > 0 && stack.peek() < A[i]){
                temp.push(stack.pop());
            }
            stack.push(A[i]);
            while(temp.size() > 0){
                stack.push(temp.pop());
            }
        }
        int[] out = new int[A.length];
        int cnt=0;
        while(stack.size() > 0) {
            out[cnt] = stack.pop();
            System.out.print(out[cnt] + " ");
            cnt++;
        }
    }
}
