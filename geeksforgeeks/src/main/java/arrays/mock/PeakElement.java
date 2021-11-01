package arrays.mock;

public class PeakElement {
    public static void main(String[] args) {
        //int[] A = {1, 8, 9, 2, 3, 4, 6, 5, 100, 83, 76, 54};
        //int[] A = {1, 2, 3, 4, 5};
        //int[] A = {5, 17, 100, 11};
        //int[] A = {2,3};
       int[] A = {3,4,3,2,1};

        System.out.println(findElement(A, 0, A.length - 1));
    }

    public static int findElement(int[] A, int l, int r) {
            if (l <= r) {
                if((r-l) == 1)
                    return A[l] > A[r] ? l : r;
                int mid = l + (r - l) / 2;
                if (mid == 0 || mid == A.length - 1)
                    return mid;
                if (A[mid - 1] < A[mid] && A[mid + 1] < A[mid])
                    return mid;
                if (A[mid - 1] > A[mid])
                    return findElement(A, l, mid - 1);
                return findElement(A, mid + 1, r);
            }
            return A[0];
    }
}