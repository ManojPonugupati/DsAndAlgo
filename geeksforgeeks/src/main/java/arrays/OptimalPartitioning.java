package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OptimalPartitioning {
    public static void main(String[] args) {
        Integer[] A = {3, 1, 2, 6, 4};
        ArrayList<Integer> ar = new ArrayList<>();
        ar.addAll(Arrays.asList(A));
        System.out.println(optimalPartitioning(ar));
    }
    public static int optimalPartitioning(ArrayList<Integer> A){
        Collections.sort(A,Collections.reverseOrder());
        System.out.println(A);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<A.size()-1;i++){
            if(Math.abs(A.get(i) - A.get(i+1)) < min )
                min=Math.abs(A.get(i) - A.get(i+1));
        }
        return min;
    }
}
