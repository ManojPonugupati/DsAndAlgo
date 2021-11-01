package arrays.AdvancedBatch.twopointers;

public class PairsWithGivenSum {
    public static void main(String[] args) {
        int[] A = {2, 4, 4, 5, 6, 8, 10};
        int B = 6;
        System.out.println(totalPairsWithGivenSum(A,B));
    }
    public static int totalPairsWithGivenSum(int[]A, int B){
        int totalPairs = 0;
        int mod = 1000000007;
        int i=0;int j=A.length-1;
        int sum=0;
        while(i<j){
            sum = A[i] + A[j];
            if(sum > B){
                j--;
            } else if(sum < B){
                i++;
            }else
            {
                int x = A[i];int temp_i = i;
                while((i<j) && x == A[i])
                    i++;
                int y = A[j]; int temp_j =j;
                 while((j>=i) && j==A[j])
                     j--;
                 if(x == y){
                     int temp = ((i - temp_i) + (temp_j - j))%mod;
                        temp = ((temp*(temp+1))%mod)/2;
                        totalPairs += (totalPairs + temp)%mod;
                 } else{
                     int temp = (((i - temp_i)==0 ? 1: (i - temp_i)) * ((temp_j - j) == 0 ? 1 : (temp_j - j)))%mod;
                     totalPairs += (totalPairs + temp)%mod;
                 }
            }
        }
        return totalPairs;
    }

}
