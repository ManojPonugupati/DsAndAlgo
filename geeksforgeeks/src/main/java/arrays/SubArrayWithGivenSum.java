package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        //Integer[] ar = {15, 2, 48, 19, 28, 22, 44, 2, 32, 46, 46, 24, 1, 23, 49, 26, 23, 17, 17, 46, 4, 30, 40, 36, 20, 5};
        //int B=82;
        Integer[] ar = {1,2,3,4,5,6,7,8,14};
        int B=35;
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(ar));
        System.out.println(solve(list,B));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A,int B){
        ArrayList<Long> prefix_sum = new ArrayList<>();
        ArrayList<Integer> out_list = new ArrayList<>();
        HashMap<Long,Integer> hm = new HashMap<>();
        if(!(B>0)){
             out_list.add(-1);
             return out_list;
        }

        prefix_sum.add((long) 0);
        long rolling_sum=0;
        int end_index=-1;
        for(int i=0;i<A.size();i++){
            rolling_sum += A.get(i);
            prefix_sum.add(rolling_sum);
        }
        boolean found=false;
        int start_index=-1;
        for(int i=0;i<prefix_sum.size();i++){
            hm.put(prefix_sum.get(i), i);
        }
        for(int i=0;i<prefix_sum.size();i++) {
            if (hm.containsKey(prefix_sum.get(i) + B)) {
                end_index = hm.get(prefix_sum.get(i) + B)-1;
                if(end_index == 0)
                    end_index=A.size()-1;
                if(end_index <0)
                    end_index=0;
                found = true;
                break;
            }
        }
        rolling_sum=0;
        for(int i=end_index;found && (i>=0 && !(rolling_sum ==B));i-- )
        {
            rolling_sum +=A.get(i);

            start_index=i;
        }
        if(start_index ==  -1 && end_index ==0 ){
            out_list.add(A.get(0));
        }else{
            for(int i=start_index;i<=end_index && found;i++){
                out_list.add(A.get(i));
            }
        }

        if(!found)
            out_list.add(-1);

        return out_list;
    }
}
