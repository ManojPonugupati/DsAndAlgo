package recursion;

public class TestRecursion {
    public static void main(String[] args) {
        System.out.println("final out " + testRec(3));
    }

    public static int testRec(int n){
        if(n==0) return 0;
        System.out.println("rec data " + n);
        return n+testRec(n-1);
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
