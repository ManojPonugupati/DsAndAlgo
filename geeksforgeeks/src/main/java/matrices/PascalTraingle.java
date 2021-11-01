package matrices;

import java.util.ArrayList;

public class PascalTraingle {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        int A=5;
        ar = generatePascalTraingle(A);
        for(ArrayList<Integer> list : ar){
            for(Integer elem : list){
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
    public static ArrayList<ArrayList<Integer>>  generatePascalTraingle(int A){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i=0;i<A;i++){
            ArrayList<Integer> ar = new ArrayList<>();
            res.add(ar);
        }
        int element=0;
        for(int i=0;i<A;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i)
                {
                    res.get(i).add(1);
                } else {
                    element=res.get(i-1).get(j-1) + res.get(i-1).get(j);
                    res.get(i).add(element);
                }
            }
        }

        return res;
    }
}
