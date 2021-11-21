package stacks;

import java.util.Stack;

public class CheckTwoBracketExpressions {
    public static void main(String[] args) {
        String A ="-(a+b+c)";
        String B = "-a-b-c";
        Stack<Boolean> stack = new Stack<>();
        Boolean open_brace_hit=false;
        System.out.println("int type of a is : " + (int)'a' + " " + (int)'+' + " " + (int)'-' + (int)'z');
        char[] ch = new char[26];
        char prev_char=A.charAt(0);
        if(A.charAt(0)=='-')
            stack.push(false);
        else if(A.charAt(0)=='(')
              open_brace_hit=true;
        else stack.push(true);
        for(int i=1;i<A.length();i++){
             if(A.charAt(i)=='('){
                 stack.push(true);
                 open_brace_hit=true;
            }
        }
    }
}
