package backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class AllPermutations {
    public static void main(String[] args) {
        ArrayList<Integer> ar  = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        int n=ar.size();
        ArrayList<ArrayList<Integer>> out = generateAllPermuations(ar,n);
        for(ArrayList<Integer> l : out){
            System.out.println(l);
        }
    }
    public static ArrayList<ArrayList<Integer>>
        generateAllPermuations(ArrayList<Integer>A,int N){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>(A);
        A.clear();
        A.addAll(hs);
        Collections.sort(A);
        permute(ans,temp,A);
        return ans;
    }
    public static void
      permute(ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> tmp,
              ArrayList<Integer> A){
        if(A.size()==0)
            ans.add(new ArrayList<>(tmp));
        else {
            for (int i = 0; i < A.size(); i++) {
                tmp.add(A.get(i));
                ArrayList<Integer> ar = new ArrayList<>();
                ar.addAll(A.subList(0, i));
                ar.addAll(A.subList(i + 1, A.size()));
                permute(ans, tmp, ar);
                tmp.remove(A.get(i));
            }
        }
    }
}
