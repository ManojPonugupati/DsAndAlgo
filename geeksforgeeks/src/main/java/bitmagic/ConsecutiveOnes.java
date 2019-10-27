package bitmagic;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(maxConsecutiveOnes(927));
    }
    public static int maxConsecutiveOnes(int n){
        int result=0;
        int count=0;
        if((n&1) > 0){
            count++;
        }
        while(n>0){
            if((n>>1 & 1) >0){
                count++;
                n = n>>1;
            }
            else {
                result = Math.max(result,count);
                count=0;
                n=n>>1;
            }
        }
        return result;
    }
}
