package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class XorQueries {
    public static void main(String[] args) {
        Integer[] arr = {1,0,0,0,1};
        ArrayList<Integer> ar = new ArrayList<>();
        ArrayList<Integer> Q1 = new ArrayList<>();
        ArrayList<Integer> Q2 = new ArrayList<>();
        ArrayList<Integer> Q3 = new ArrayList<>();
        Q1.add(2);
        Q1.add(4);
        Q2.add(1);
        Q2.add(5);
        Q3.add(3);
        Q3.add(5);
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        B.add(Q1);
        B.add(Q2);
        B.add(Q3);
        ar.addAll(Arrays.asList(arr));
        System.out.println(xorQueries(ar,B));
    }

    public static ArrayList<ArrayList<Integer>> xorQueries(ArrayList<Integer> A,ArrayList<ArrayList<Integer>> B){
        ArrayList<ArrayList<Integer>> outlist = new ArrayList<>();
        for(int i =0;i<B.size();i++){
            ArrayList<Integer> a = new ArrayList<>();
            a.add(0);
            a.add(0);
            outlist.add(a);
        }
        ArrayList<Integer> zeros_prefix_sum = new ArrayList<>();
        int zeroes_counter=0;
        for(int i=0;i<A.size();i++) {
            if (A.get(i)==0){
                zeroes_counter++;
                zeros_prefix_sum.add(zeroes_counter);
            }else {
                zeros_prefix_sum.add(zeroes_counter);
            }
        }
        int left_index=0;
        int right_index=0;
        int list_counter=0;
        int index_diff =0;
        int left_right =0;
        for(ArrayList<Integer> list : B){
            left_index = list.get(0)-1;
            right_index = list.get(1)-1;
            if(left_index == 0){
                outlist.get(list_counter).set(0,zeros_prefix_sum.get(right_index%2));
                outlist.get(list_counter).set(1,zeros_prefix_sum.get(right_index));
            }else {
                index_diff = right_index -left_index + 1;
                left_right = zeros_prefix_sum.get(right_index) - zeros_prefix_sum.get(left_index -1);
                outlist.get(list_counter).set(0,Math.abs(index_diff - left_right)%2);
                outlist.get(list_counter).set(1,zeros_prefix_sum.get(right_index)-zeros_prefix_sum.get(left_index-1));
            }
            list_counter++;
        }
        return outlist;
    }
}
