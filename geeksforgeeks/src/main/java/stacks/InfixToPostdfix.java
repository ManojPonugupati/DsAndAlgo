package stacks;

import java.util.Stack;

public class InfixToPostdfix {
    public static void main(String[] args) {
        String A ="a+b*(c^d-e)^(f+g*h)-i";

        //String Out = getInfixConvertedToPostfix(A);
    }
    public static String getInfixConvertedToPostfix(String A){
        Stack<Character> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        char POW='^';
        char open='(';  char close=')';
        char div='/';   char mul='*';
        char minus='-'; char plus ='+';
        boolean pushed_open=false;
        for(int i=0;i<A.length();i++){
            boolean check = A.charAt(i)==POW ||
                    A.charAt(i)==open||
                    A.charAt(i)==close||
                    A.charAt(i)==div ||
                    A.charAt(i)==mul ||
                    A.charAt(i)==plus ||
                    A.charAt(i)==minus;
            boolean div_check = A.charAt(i)==POW ||
                                A.charAt(i)==div ||
                                A.charAt(i)==mul;
            if(!check)
                sb.append(A.charAt(i));
            else if(stack.isEmpty()) {
                stack.push(A.charAt(i));
            } else if(!stack.isEmpty()){
                if(A.charAt(i)==open) {
                    stack.push(A.charAt(i));
                    pushed_open=true;
                }
                else if(A.charAt(i)==close) {
                    while (!(stack.peek() == open))
                        sb.append(stack.pop());
                    stack.pop();
                    pushed_open=false;
                } else if(A.charAt(i)==POW)
                    stack.push(A.charAt(i));
                }
            }
        return sb.toString();
            }
        }

