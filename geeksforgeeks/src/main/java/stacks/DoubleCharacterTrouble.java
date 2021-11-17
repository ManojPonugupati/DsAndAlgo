package stacks;

import java.util.Stack;

public class DoubleCharacterTrouble {
    public static void main(String[] args) {
        String A = "abccbc";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<A.length();i++){
            if(stack.size()==0){
                stack.push(A.charAt(i));
            } else if(Character.compare(stack.peek(),A.charAt(i))==0){
                     stack.pop();
            } else stack.push(A.charAt(i));
        }
        StringBuffer sb = new StringBuffer();
        while(stack.size()>0) {
            sb.append(stack.pop());
        }
        System.out.println(sb.reverse().toString());
    }
}
