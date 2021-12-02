package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NQueens {
    static int A = 4;
    public static void main(String[] args) {
        Boolean[] lsd = new Boolean[2*A];
        Boolean[] rsd = new Boolean[2*A];
        Boolean[] viscol = new Boolean[A];
        System.out.println(viscol.length);
        Arrays.fill(lsd,false);
        Arrays.fill(rsd,false);
        Arrays.fill(viscol,false);
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<ArrayList<Integer>> out = new ArrayList<>();
        int row=0;

        getNQueens(row,out,lsd,rsd,viscol,temp);
        ArrayList<String> str;
        ArrayList<ArrayList<String>> prnt= new ArrayList<>();
        int k=0;
        for(ArrayList<Integer> tmp :out)
        {
           String s="";
           k++;
           for(int i=0;i<tmp.size();i++){
               int j=0;
               while(j<tmp.size()){
                   if(tmp.get(i)==j){
                       s=s+"Q";
                   } else s=s+".";
                   j++;
               }
               if(i<tmp.size()-1)
               s=s+" ";
           }
            str = new ArrayList<>(Collections.singleton(s));
            prnt.add(new ArrayList<>(str));
        }
        System.out.println(prnt);
    }
    public static void
    getNQueens(int row, ArrayList<ArrayList<Integer>> out, Boolean[] lsd,Boolean[] rsd,Boolean[] viscol,
               ArrayList<Integer> temp){
        if(row >= viscol.length) {
            out.add(new ArrayList<>(temp));
            return;
        }
        for(int col=0;col<A;col++){
            if(lsd[row+col] == false &&
               rsd[row-col+viscol.length-1]==false &&
               viscol[col]==false){
                rsd[row-col+viscol.length-1] =true;
                lsd[row+col]=true;
                viscol[col]=true;
                temp.add(new Integer(col));
                getNQueens(row+1,out,lsd,rsd,viscol,temp);
                temp.remove(new Integer(col));
                rsd[row-col+viscol.length-1] =false;
                lsd[row+col]=false;
                viscol[col]=false;
            }
        }
    }
}
