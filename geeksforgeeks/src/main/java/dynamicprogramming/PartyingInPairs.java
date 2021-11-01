package dynamicprogramming;

public class PartyingInPairs {
    public static void main(String[] args) {
        int A = 8;
        int[] ar = new int[A + 1];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = -1;
        }
        System.out.println(getNumberOfPartyingWays(A,ar));
        for (int i = 0; i < ar.length; i++)
            ar[i]=-1;
        ar[0]=1;
        ar[1]=1;
        for(int i=2;i<ar.length;i++){
            ar[i] = ar[i-1] + (i-1)*ar[i-2];
        }
        System.out.println("result is " + ar[A]);
    }
    public static int getNumberOfPartyingWays(int A,int[] ar){
        if(A<2) return 1;
        if(ar[A] != -1) return ar[A];
        ar[A] = getNumberOfPartyingWays(A-1,ar) + (A-1)*getNumberOfPartyingWays(A-2,ar);
        return ar[A];
    }
}
