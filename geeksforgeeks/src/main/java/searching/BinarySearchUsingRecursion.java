package searching;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34};
        for(int x=-10;x<45;x++)
            System.out.println(x + "index is " + search(arr,0, arr.length-1, x));
    }
    static int search(int[]arr,int low,int high, int x) {
        int mid = low + (high - low) / 2;

        if (low <= high) {
            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x)
                return search(arr, mid + 1, high, x);
            else
                return search(arr, low, mid-1, x);
        }

        return -1;
    }
}
