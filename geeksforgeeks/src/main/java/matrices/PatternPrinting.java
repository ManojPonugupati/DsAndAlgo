package matrices;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PatternPrinting {
    public static void main(String[] args) {
        int A=5;
        ArrayList<ArrayList<Integer>> ar_list = new ArrayList<>();
        ar_list = printOrder(A);
        for(ArrayList<Integer> list:ar_list){
            for(Integer element:list){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    public static ArrayList<ArrayList<Integer>> printOrder(int A){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i=0;i<A;i++){
            ArrayList<Integer> ar = new ArrayList<>();
            for(int j=0;j<A;j++){
                ar.add(0);
            }
            res.add(ar);
        }
        int counter=0;
        for(int i=A-1;i>=0;i--){
            counter=i+1;
            for(int j=A-i-1;j<A;j++){
                res.get(i).set(j,counter);
                --counter;
            }

        }
        return res;
    }
}
