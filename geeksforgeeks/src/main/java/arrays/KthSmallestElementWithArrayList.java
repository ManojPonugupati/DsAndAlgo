package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class KthSmallestElementWithArrayList {

    public static void main(String[] args) {
        Integer[] arr = {10, 7, 8, 9, 1, 5 };
        ArrayList<Integer> ar = new ArrayList<>();
        ar.addAll(Arrays.asList(arr));
        System.out.println(kthSmalestElement(ar,1));
    }

    public static int kthSmalestElement(final ArrayList<Integer> A, int B){

        Integer[] ar = new Integer[A.size()];
        A.toArray(ar);
        if(B-1 <0 || B > A.size())
            return -1;
        return kthSmallestInt(ar,0,ar.length-1,B-1);
    }

    public static int kthSmallestInt(Integer[] A,int low,int high, int B){
        while(low<high) {
            int pi = partiton(A, low, high);
            if (pi == B)
                return A[pi];
            if (B > pi)
                return kthSmallestInt(A, pi + 1, high, B);
            return kthSmallestInt(A, 0, pi - 1, B);
        }
        if (B == high)
            return A[B];
        if (B == 0)
            return A[0];

        return -1;
        }

    public static int partiton(Integer[] A, int low, int high){
        int pivot = A[high];
        int i=low;
        int swap_temp=0;
        for(int j=low; j<=high-1; j++){
            if(pivot > A[j]){
                swap_temp = A[j];
                A[j]=A[i];
                A[i]=swap_temp;
                i++;
            }
        }
        swap_temp = A[i];
        A[i] = A[high];
        A[high] = swap_temp;
        return i;
    }
}
