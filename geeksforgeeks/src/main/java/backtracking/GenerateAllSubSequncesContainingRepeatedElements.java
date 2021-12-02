package backtracking;

import com.sun.org.apache.xpath.internal.operations.Bool;
import javafx.util.Pair;

import java.util.ArrayList;

public class GenerateAllSubSequncesContainingRepeatedElements {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ArrayList<Pair<Integer,Integer>> freq = new ArrayList<>();
        ArrayList<Boolean> visited = new ArrayList<>();
        for(int i=0;i<ar.size();i++)
            visited.add(false);
        int k=0;
        for(int i=0;i<ar.size();i++){
            if(visited.get(i))
                continue;
            int count=1;
            for(int j=i+1;j<ar.size();j++){
                  if(ar.get(i)==ar.get(j)){
                      visited.set(j,true);
                      count++;
                  }
            }
            freq.add(new Pair<>(ar.get(i),count));
            k++;
        }
        ArrayList<ArrayList<Integer>> output = getSubs(freq);
    }
    public static ArrayList<ArrayList<Integer>> getSubs(ArrayList<Pair<Integer,Integer>> frq){
        ArrayList<ArrayList<Integer>> out = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        return out;

    }
}
