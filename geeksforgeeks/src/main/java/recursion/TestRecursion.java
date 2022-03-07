package recursion;

import java.util.Stack;

public class TestRecursion {
    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();
        testRec(5,st);
        while (st.size() > 0){
            System.out.println(st.pop());
        }
    }

    public static Stack<Integer> testRec(int n,Stack<Integer> st){
        if(n==0) return st;
        if(n==3) return st;
        st.push(n);
        testRec(n-1,st);
        return st;
    }

}
/*
 3+ tes(2)
  2+ test(1)
   1+test(0)

    ==>
    1+0
      2+1
      3 + 3 -- return 6;

*/
