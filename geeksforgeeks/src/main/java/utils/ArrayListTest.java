package utils;

import java.util.ArrayList;
import java.util.Stack;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("a");
        ar.add("b");
        ar.add("c");
        System.out.println(ar);
        ar.remove(ar.size()-1);
        System.out.println(ar);
        ar.remove(ar.size()-1);
        System.out.println(ar);
        ar.remove(ar.size()-1);
        System.out.println(ar);
        if(ar.size()>0)
        ar.remove(ar.size()-1);
        System.out.println(ar);
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("d");
        ar.addAll(stack);
        System.out.println(ar);
    }
}
