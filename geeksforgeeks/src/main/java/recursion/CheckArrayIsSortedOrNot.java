package recursion;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] A = {1,3,2,4,5,6};
        int n = A.length-1;
        System.out.println(isArrayInSortedOrderOrNot(A,n));
    }
    public static int isArrayInSortedOrderOrNot(int[] A, int n){
        if(n==0)
            return 1;
        return A[n] < A[n-1] ? 0: isArrayInSortedOrderOrNot(A,n-1);
    }
}
