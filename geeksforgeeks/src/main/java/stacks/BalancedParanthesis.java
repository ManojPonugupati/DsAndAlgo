package stacks;

import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String A = "([}]";
        Stack<Character> stack = new Stack<>();
        stack.push(A.charAt(0));
        for(int i=1;i<A.length();i++) {
            switch (A.charAt(i)) {
                case '}': if(Character.compare(stack.peek(),'{')==0){
                    stack.pop();
                }
                    break;
                case ']' : if(Character.compare(stack.peek(),'[')==0) {
                    stack.pop();
                }
                break;
                case ')' :  if(Character.compare(stack.peek(),'(')==0) {
                    stack.pop();
                }
                break;
                default:stack.push(A.charAt(i));
            }
        }
        System.out.println(stack.isEmpty());
    }
}
