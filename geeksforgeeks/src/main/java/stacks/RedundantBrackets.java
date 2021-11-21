package stacks;

import java.util.Stack;

public class RedundantBrackets {
    public static void main(String[] args) {
         String A = "((a+b))";
        // String A = "(a+(a+b))";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<A.length();i++){
            switch (A.charAt(i)) {
                case '(':
                case '+':
                case '-':
                case '*':
                case '/':
                    stack.push(A.charAt(i));
                    break;
                case ')' :
                    if(Character.compare(stack.peek(),'(')==0)
                        return;
                    stack.pop();
                    stack.pop();
                    break;
            }
        }
        System.out.println("outside the loop, just check above statment for result");
    }
}
