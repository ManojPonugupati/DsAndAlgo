package searching;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {10,27,25,24,23};
        int[] arr3 = {988,857,744,492,228,366,860,937,433,552,438,229,276,408,475};
        System.out.println(peakElement(arr3,arr3.length));
    }
    static int peakElement(int[] a, int n){
        int low =0;
        int high = n-1;
        int mid = high/2;
        while(low <= high){
            if (mid == high){
                if(a[mid] > a[mid -1]){
                    return mid;
                }
            } else if (mid == low){
                if (a[mid] > a[mid + 1]){
                    return mid;
                }
            }
            if((mid== 0 || a[mid] >= a[mid - 1]) && (mid == high ||
                     a[mid] > a[mid + 1])){
                return mid;
            }else if (mid > 0 && a[mid] < a[mid + 1]){
                low = mid + 1;
                mid = low + (high - low)/2;
            } else if(mid > 0 && a[mid] < a[mid -1]){
                high = mid -1;
                mid = low + (high - low)/2;
            }
        }
        return mid;
    }
}
