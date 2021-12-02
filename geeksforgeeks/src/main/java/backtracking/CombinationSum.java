package backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(2);
        ar.add(4);
        ar.add(6);
        ar.add(8);
        int sum=8;
        ArrayList<ArrayList<Integer>> ans = getCombinationSum(ar,sum);
        for(ArrayList<Integer> l:ans){
            System.out.println(l);
        }
    }
    public static ArrayList<ArrayList<Integer>>
          getCombinationSum(ArrayList<Integer> A,int B){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>(A);
        A.clear();
        A.addAll(hs);
        Collections.sort(A);
        int idx=0;
        getNumbersComb(ans,temp,A,B,idx);
        return ans;
    }
    public static void
          getNumbersComb(ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> temp,
                         ArrayList<Integer> ar,int sum,int idx){
        if(sum==0){
            ans.add(new ArrayList<>(temp));
        }
        for(int i=idx;i<ar.size();i++){
            if(sum-ar.get(i) >=0){
                temp.add(ar.get(i));
                getNumbersComb(ans, temp, ar, sum-ar.get(i),i);
                temp.remove(ar.get(i));
            }
        }
    }
}
