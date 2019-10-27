package searching;

public class FloorInSortedArray {
    public static void main(String[] args) {
        long[] arr = {1,2,7,8,9,10,11,12,19};
        long[] arr2 = {1,2,8,10,11,12,19};
        long s = 5;
        System.out.println(findFloor(arr2,0,arr2    .length-1,s));
    }
    static int findFloor(long arr[],int left, int right,long x){
        int mid = right/2;
        while(left <= right){
            if(arr[mid] == x){
                return mid;
            } else if(arr[mid] > x){
                right = mid -1;
                mid = left + (right -left)/2;
            }else {
                left = mid + 1;
                mid = left + (right -left)/2;
            }
        }

        return mid-1;
    }
}
