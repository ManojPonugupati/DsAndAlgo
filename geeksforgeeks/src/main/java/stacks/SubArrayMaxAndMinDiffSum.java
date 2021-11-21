package stacks;

import java.util.Stack;

public class SubArrayMaxAndMinDiffSum {
    public static void main(String[] args) {
        //int[] A = {4, 7, 3, 8};
        int[] A = {992387, 932142, 971117, 934674, 988917, 967890, 948508, 970347};
        Stack<Integer> stack = new Stack<>();
        int[] l_min = new int[A.length+1];
        int[] r_min = new int[A.length+1];
        int[] l_max = new int[A.length+1];
        int[] r_max = new int[A.length+1];
        long OneE9 = 1000000007;
        l_min[0]=-1;
        for(int i=0;i<A.length;i++){
            while(!stack.isEmpty() && A[stack.peek()] >= A[i]){
                stack.pop();
            }
            if(stack.isEmpty())
                l_min[i]=l_min[0];
            else l_min[i]=stack.peek();
            stack.push(i);
        }

        while(!stack.isEmpty())
            stack.pop();
        r_min[A.length]=A.length;
        for(int i=A.length-1;i>=0;i--) {
            while (stack.size() > 0 && A[stack.peek()] >= A[i]) {
                stack.pop();
            }
            if (stack.isEmpty())
                r_min[i] = r_min[A.length];
            else r_min[i] = stack.peek();
            stack.push(i);
        }
        while(!stack.isEmpty())
            stack.pop();
        l_max[A.length]=A.length;
        l_max[0]=-1;
        for(int i=0;i<A.length;i++){
            while(!stack.isEmpty() && A[i] >= A[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                l_max[i] = l_max[0];
            } else l_max[i]=stack.peek();
            stack.push(i);
        }
        while(!stack.isEmpty())
            stack.pop();
        r_max[A.length]=A.length;
        for(int i=A.length-1;i>=0;i--) {
            while (!stack.isEmpty() && A[i] >= A[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                r_max[i] = l_max[A.length];
            } else r_max[i] = stack.peek();
            stack.push(i);
        }
        long total_sum = 0;
        for(int i=0;i<A.length;i++){
            long x =  (r_max[i]-i)*1L*(i-l_max[i]);
            long y =  (r_min[i]-i)*1L*(i-l_min[i]);
            long sum = A[i]*1L*(x-y);
            total_sum = (total_sum + sum);
            total_sum %=OneE9;
        }
        if(total_sum < 0)
             total_sum +=OneE9;
        System.out.println(total_sum);
    }
}
