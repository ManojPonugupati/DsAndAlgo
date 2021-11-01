package arrays;

import java.util.HashMap;

public class ContiguousArrayOf1sAnd0s {
    public static void main(String[] args) {
        int[] A = {0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0};
        System.out.println(contiguousArrayOf1sAnd0s(A));
    }
    public static int contiguousArrayOf1sAnd0s(int[]A) {
        int[] ps = new int[A.length + 1];
        HashMap<Integer, Integer> hm = new HashMap<>();
        Integer sum = 0;
        for (int i = 1; i < A.length; i++){
            if (A[i - 1] == 0) {
                sum++;
            } else {
                sum--;
            }
        hm.put(sum, sum);
    }
            System.out.print(hm);
        return 1;
    }
}
