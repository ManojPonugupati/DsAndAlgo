package backtracking;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GenerateAllSubSequences {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
       ArrayList<ArrayList<Integer>> out= generateSubSequences(ar);
       for(ArrayList<Integer> o : out){
           System.out.println(o);
       }
    }
    public static ArrayList<ArrayList<Integer>>
            generateSubSequences(ArrayList<Integer> A){
        ArrayList<ArrayList<Integer>> out = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        gen(out,temp,A,0);
        return out;
    }
    public static void gen(ArrayList<ArrayList<Integer>> out,ArrayList<Integer> temp,
                           ArrayList<Integer>A,int index){
        if(index==A.size()) {
            out.add(new ArrayList(temp));
            return;
        }
        gen(out,temp,A,index+1);
        temp.add(A.get(index));
        gen(out,temp,A,index+1);
        temp.remove(A.get(index));
    }

}
