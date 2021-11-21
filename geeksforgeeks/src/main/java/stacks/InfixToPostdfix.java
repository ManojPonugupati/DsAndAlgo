package stacks;

import java.util.Stack;

public class InfixToPostdfix {
    public static void main(String[] args) {
        String A ="a+b*(c^d-e)^(f+g*h)-i";
        String Out = getInfixConvertedToPostfix(A);
    }
    public static String getInfixConvertedToPostfix(String A){
        Stack<Character> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        char POW='^';
        char open='(';
        char close=')';
        char div='/';
        char plus ='+';
        char minus='-';

        for(int i=0;i<A.length();i++){
            }
        return sb.toString();
        }
    }

