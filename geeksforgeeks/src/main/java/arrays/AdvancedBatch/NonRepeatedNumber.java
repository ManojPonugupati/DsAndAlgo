package arrays.AdvancedBatch;

public class NonRepeatedNumber {
    public static void main(String[] args) {
        int[] A = {1,1,2,2,3,3,4,5,5,6,6,7,7};
        int ans=0;
        for(int i=0;i<A.length;i++){
            ans = A[i] ^ ans;
        }
        System.out.println(ans);
    }
}
