package stacks;

import java.util.Stack;

public class NearestSmallestElement {
    public static void main(String[] args) {
        int[] A = {34, 35, 27, 42, 5, 28, 39, 20, 28 };
        //expected result : -1 34 -1 27 -1 5 28 5 20
        Stack<Integer> stack = new Stack<>();
        int[] out = new int[A.length];
        out[0] = -1;
        stack.push(A[0]);
        for(int i=1;i<A.length;i++){
          while(stack.size() >0 && stack.peek() >= A[i] ){
              stack.pop();
          }
          if(stack.size() > 0) {
              out[i]=stack.peek();
              stack.push(A[i]);
          } else
          {
              stack.push(A[i]);
              out[i]=-1;
          }
        }
        for(int i=0;i<out.length;i++){
            System.out.print(out[i] + " ");
        }
        System.out.println();
    }
}
