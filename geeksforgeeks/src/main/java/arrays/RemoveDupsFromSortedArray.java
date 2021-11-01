package arrays;

import java.util.ArrayList;

public class RemoveDupsFromSortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(1);
        ar.add(1);
        System.out.println(solve(ar));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A){
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=1;i<A.size();i++){
            if(A.get(i-1).equals(A.get(i)))
                continue;
            else
                ar.add(A.get(i-1));
        }
        ar.add(A.get(A.size()-1));
        return ar;
    }
}
