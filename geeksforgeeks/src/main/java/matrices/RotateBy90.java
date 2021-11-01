package matrices;

import java.util.ArrayList;
import java.util.Arrays;


public class RotateBy90 {
    public static void main(String[] args) {
       // Integer[][] mat = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},
        //        {21,22,23,24,25}};
        Integer[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            ArrayList<Integer> ar1=new ArrayList<>();
            ar1.addAll(Arrays.asList(mat[i]));
            ar.add(ar1);
        }
        System.out.println("ArrayList output is");
        for(ArrayList<Integer> list:ar){
            for(Integer element:list){
                System.out.print(element + " ");
            }
            System.out.println();
        }
        //SwapArrayList swap = new SwapArrayList();
        //swap.rotateBy90(ar);
        AntiDiagonals antiDiagonals = new AntiDiagonals();
        antiDiagonals.antiDiagonals(ar);
        System.out.println("After swapping");
        for(ArrayList<Integer> list:ar){
            for(Integer element:list){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

}
