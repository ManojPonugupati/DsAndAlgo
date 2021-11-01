package arrays.AdvancedBatch;

public class SingleNumber {
    public static void main(String[] args) {
        int ans=0;
        int[] A = {1,1,1,2,2,2,3,3,3,4,5,5,5,6,6,6};
        for(int i=0;i<=31;i++){
            int cnt=0;
            for(int j=0;j<A.length;j++){
                if((A[j] & (1<<i)) > 0)
                    cnt++;
            }
            if(cnt%3 != 0)
                ans += (1<<i);

        }
        System.out.println(ans);
    }
}
