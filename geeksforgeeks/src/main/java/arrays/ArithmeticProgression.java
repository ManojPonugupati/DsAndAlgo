package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Integer[] arr = {10,8,6,4,2,0,-2,-4,-6,5};
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));
        System.out.println(solve(list));
    }

    public static int solve(ArrayList<Integer> A){
        //find the first and second max;
        int first_min =Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;
        for(int i=0;i<A.size();i++){
            if(first_min > A.get(i)){
                second_min = first_min;
                first_min = A.get(i);
            }else if(second_min > A.get(i) && A.get(i) != first_min){
                second_min = A.get(i);
            }
        }
        int ap_diff = second_min - first_min;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<A.size();i++){
            hm.put(A.get(i),1);
        }
        for(int i=0;i<A.size();i++){
            if(! hm.containsKey(first_min + i*ap_diff))
                return 0;
        }
        return 1;
    }
}
