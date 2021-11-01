package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SubArrayWithSumZero {
    public static void main(String[] args) {
        Integer[] ar = {5, 17, -22, 11};
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(ar));
        System.out.println(solve(list));
    }
    public static int solve(ArrayList<Integer> A){
        HashMap<Long,Integer> hm = new HashMap<>();
         long rolling_sum=0;
        for(Integer element:A){
            rolling_sum +=element;
            if(hm.containsKey(rolling_sum)){
                return 1;
            }
            if(rolling_sum==0)
                return 1;
            hm.put(rolling_sum,0);
        }
        return 0;
    }
}
