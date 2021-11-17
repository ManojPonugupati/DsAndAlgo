package stacks;

import java.util.Stack;

public class EvaluateExpression {

    public static void main(String[] args) {
        String[] A = {"5", "1", "2", "+", "4", "*", "+", "3", "-"};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.length; i++)
            switch (A[i]) {
                case "+":
                    int val1 = stack.pop();
                    int val2 = stack.pop();
                    stack.push(val1 + val2);
                    break;
                case "*" :
                    int mul1 = stack.pop();
                    int mul2 = stack.pop();
                    stack.push(mul1*mul2);
                    break;
                case "-" :
                    int min1 = stack.pop();
                    int min2 = stack.pop();
                    stack.push(min2-min1);
                    break;
                case "/":
                    int div1 = stack.pop();
                    int div2 = stack.pop();
                    stack.push(div2/div1);
                    break;
                 default:
                     stack.push(Integer.parseInt(A[i]));
            }
        System.out.println("out is "  + stack.peek());
    }
}