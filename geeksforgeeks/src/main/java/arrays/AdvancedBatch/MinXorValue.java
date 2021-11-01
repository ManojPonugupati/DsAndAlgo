package arrays.AdvancedBatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinXorValue {
    public static void main(String[] args) {
        Integer[] A = {9,8,7,6,5,4,3,2,1};
        ArrayList<Integer> ar = new ArrayList<>();
        ar.addAll(Arrays.asList(A));
        System.out.println(findMinXorValue(ar));
    }
    public static int findMinXorValue(ArrayList<Integer> A)
    {
        Collections.sort(A);
        int minXOR = Integer.MAX_VALUE;
        for(int i=1;i<A.size();i++)
        {
            if(minXOR > (A.get(i) ^ A.get(i-1)))
                minXOR = A.get(i) ^ A.get(i-1);
        }
        return minXOR;
    }
}
