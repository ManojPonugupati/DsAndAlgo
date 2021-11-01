package arrays.AdvancedBatch;

public class NonRepeatedTwoNumbers {
    public static void main(String[] args) {
        int[] A = {1,1,2,2,3,3,4,4,6,10,7,7,8,8,9,9};
        int xor = 0;
        for(int i=0;i<A.length;i++){
            xor = xor ^A[i];
        }
        int setBitPosition = 0;
        for(int i=0;i<32;i++)
        {
            if((xor & (1<<i)) > 0){
                setBitPosition=i;
                break;
            }

        }
        // partition the input array depending upon setbitPosition
        int firstMissingNumber = 0;
        for(int i=0;i<A.length;i++){
            if((A[i] & (1<< setBitPosition)) > 0)
                firstMissingNumber = firstMissingNumber ^ A[i];
        }
        int sec_missing_number = firstMissingNumber ^ xor;
        System.out.println(firstMissingNumber + " " + sec_missing_number);
    }
}
