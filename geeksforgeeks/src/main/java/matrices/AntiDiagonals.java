package matrices;

import java.util.ArrayList;

public class AntiDiagonals {
    public void antiDiagonals(ArrayList<ArrayList<Integer>> A){
        ArrayList<ArrayList<Integer>> res= new ArrayList<ArrayList<Integer>>();
        for (int i=0; i<2*A.size() -1; i++) {
            // for each row make a *new* arraylist
            ArrayList<Integer> row = new ArrayList<Integer>();
            //  add it to the row
            res.add(row);
        }
        int element=0;
        for(int i=0;i<A.size();i++) {
            for (int j = 0; j <A.size(); j++) {
                element = A.get(i).get(j);
                res.get(i+j).add(element);
            }
        }
    }
}
