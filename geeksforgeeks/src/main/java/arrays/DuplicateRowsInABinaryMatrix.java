package arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class DuplicateRowsInABinaryMatrix {
    public static void main(String[] args) {
        int[][] A = {{1,0,0},{0,1,0},{0,1,0}};
        int[] out = duplicateRowsInABinaryMatrix(A);
        for(int i=0;i<out.length;i++){
            System.out.print(out[i] + " ");
        }
        System.out.println();
    }
    public static int[] duplicateRowsInABinaryMatrix(int[][] A){
        ArrayList<Integer> out = new ArrayList<>();
        HashMap<String,Integer> hm = new HashMap<>();
        char[] ch = new char[A[0].length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                ch[j]=(char) A[i][j];
            }
            if(hm.containsKey(String.valueOf(ch)))
                out.add(i+1);
             else hm.put(String.valueOf(ch),i);
        }
       int[] arr = out.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}
