package searching;

public class CountOnesInBinary {
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(countOnes(arr,arr.length));
    }
    static int countOnes(int[] arr, int n){
        int low =0;
        int high = n-1;
        int mid = low + (high - low)/2;
        while (low <= high){
            if (arr[mid] == 1) {
                low = mid+1;
            } else {
                high = mid -1;
            }
            mid = low + (high - low)/2;
        }
        return low;
    }
}
