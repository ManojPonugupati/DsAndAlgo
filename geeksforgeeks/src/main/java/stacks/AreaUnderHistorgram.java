package stacks;

import java.util.Stack;

public class AreaUnderHistorgram {
    public static void main(String[] args) {
        int[] A = {2, 1, 5, 6, 2, 3};
        // 0 1 1 2 1 4
        //1 1 4 4 4 0
        int[] l = new int[A.length+1];
        int[] r = new int[A.length+1];
        l[0]=-1;
        r[A.length]=A.length;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<A.length;i++){
            while(!stack.isEmpty() && A[stack.peek()] >= A[i]){
                stack.pop();
            }
            if(stack.isEmpty())
                l[i]=l[0];
            else l[i]=stack.peek();
            stack.push(i);
        }
        while(!stack.isEmpty())
            stack.pop();
        for(int i=A.length-1;i>=0;i--){
            while(stack.size() > 0 && A[stack.peek()] >= A[i]){
                stack.pop();
            }
            if(stack.isEmpty())
                r[i]=r[A.length];
            else r[i]=stack.peek();
            stack.push(i);
        }

        int max_area= Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            max_area=Math.max(max_area,A[i]*(r[i]-l[i]-1));
        }
     }
}
