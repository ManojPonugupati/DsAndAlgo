package recursion;

public class TestRecursion {
    public static void main(String[] args)
    {
        testRec(3);
    }

    public static void testRec(int n){
        if(n==0) return;
        System.out.println("Bef data " + n);
        testRec(n-1);
        System.out.println("Aft data" + n);
        testRec(n-1);
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
