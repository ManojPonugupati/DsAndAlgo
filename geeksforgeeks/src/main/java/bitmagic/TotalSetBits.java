package bitmagic;

public class TotalSetBits {
    public static void main(String[] args) {
        System.out.println(totalSetBits(4));
    }

    public static int totalSetBits(int n) {
        int count = 0;
        if(n==0){
            return 0;
        }

        for (int i = 1; i <= n; i++) {
            int j=i;
            while(j !=0){
                count++;
                j= j& (j-1);
            }
        }
        return count;
    }
}
