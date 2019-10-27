package arrays;

import java.util.ArrayList;
import java.util.List;

public class ReverseKthIndex {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            ar.add(i);
        }
        for(Integer i:rev(ar,10,3)) {
            System.out.printf(i + " ");
        }
    }

    static ArrayList<Integer> rev(ArrayList<Integer> mv, int n, int k) {
        Integer[] arr = new Integer[k];
        ArrayList<Integer> retArr = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i = i + k) {
            int left = i;
            int right = i + k - 1 < n ? i + k - 1 : n-1;
            int l = 0;
            while (left <= right){
                 arr[left % k] = mv.get(right - l);
                 arr[(right - left) % k] = mv.get(left);
                 left++;
                 l++;
        }

            for (int m = i; m <= right; m++) {
                    retArr.add(m, arr[m % k]);
                }
            }
        return retArr;
    }
}