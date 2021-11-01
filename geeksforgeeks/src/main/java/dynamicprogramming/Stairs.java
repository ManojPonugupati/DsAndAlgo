package dynamicprogramming;

public class Stairs {
    public static void main(String[] args) {
        int A=10;
        int[] ar = new int[A+2];
        for(int i=0;i< ar.length;i++){
            ar[i]=-1;
        }
        System.out.println(getNumberofWays(A+1,ar));
    }
    public static int getNumberofWays(int A,int[]ar){
        if(A<2) return A;
        if(ar[A] != -1) return ar[A];
        ar[A]=getNumberofWays(A-1,ar) + getNumberofWays(A-2,ar);
        return ar[A];
    }
}
