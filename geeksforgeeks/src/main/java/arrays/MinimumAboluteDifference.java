package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinimumAboluteDifference {
    public static void main(String[] args) {
        Integer[] arr = {5,17,100,11};
        ArrayList<Integer> ar = new ArrayList<>();
        ar.addAll(Arrays.asList(arr));
        System.out.println(minAbsoluteDifference(ar));
    }
    public static int minAbsoluteDifference(ArrayList<Integer> A){
        Collections.sort(A);
        Integer min_diff = Integer.MAX_VALUE;
        for(int i=0;i<A.size()-1;i++){
            if(Math.abs(A.get(i) - A.get(i+1)) < min_diff)
                min_diff = Math.abs(A.get(i+1) - A.get(i));
        }
        return min_diff;
    }
}
