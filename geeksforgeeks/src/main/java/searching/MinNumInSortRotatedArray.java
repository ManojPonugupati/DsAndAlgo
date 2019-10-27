package searching;

public class MinNumInSortRotatedArray {
    public static void main(String[] args) {
        long [] arr = {2,3,4,5,6,7,8,9,10,1};
        int [] arr2 = {8,9,10,1,2,3,4,5,6,7};
        int [] arr4 = {1,2,3,4,5,6,7,8,9,10};
        long [] arr5 = {10,9,8,7,6,1,2,3,4};
        System.out.println(minNumber(arr5,0,9));
    }
    static long minNumber(long arr[],long low,long high){
        long mid = high/2;
        while(low < high) {
            if (mid < high && arr[(int)mid+1] < arr[(int)mid])
                return arr[(int)mid+1];
            if (mid < high && arr[(int)mid] < arr[(int)mid-1])
                return arr[(int)mid];
            if(arr[(int)high] > arr[(int)mid]) {
                high = mid - 1;
                mid = low + (high - low) / 2;
            } else {
                low = mid + 1;
                mid = low + (high - low)/2;
        }
        }
        return arr[(int)mid];
    }
}
