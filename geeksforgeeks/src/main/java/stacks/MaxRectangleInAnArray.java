package stacks;

import java.util.Stack;

public class MaxRectangleInAnArray {
    public static void main(String[] args) {
        int[][] A = {{0, 0, 1},{0, 1, 1},{1, 1, 1}};
        int max_area=getAreaUnderHistogram(A[0]);
        for(int i=1;i<A.length;i++){
            for(int j=0;j<A[0].length;j++)
                if(A[i][j]==1)
                    A[i][j] +=A[i-1][j];
            int area = getAreaUnderHistogram(A[i]);
            max_area = Math.max(max_area,area);
        }
        System.out.println(max_area);
    }
    public static int getAreaUnderHistogram(int[] A){
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
        return max_area;
    }
}
