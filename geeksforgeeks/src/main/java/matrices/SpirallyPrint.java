package matrices;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SpirallyPrint {
    public static void main(String[] args) {
        int a=6;
        ArrayList<ArrayList<Integer>> res= new ArrayList<ArrayList<Integer>>();
        res=printSpirally(a);
        /*for (int i=0; i<a; i++) {
            // for each row make a *new* arraylist
            ArrayList<Integer> zero = new ArrayList<Integer>();
            // initialize that arraylist
            for (int j=0; j<a; j++) {
                zero.add(0);
            }
            // then add it to the row
            res.add(zero);
        }
*/
        for(ArrayList<Integer> list :res){
            for(Integer element:list)
            {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> printSpirally(int A){
        ArrayList<ArrayList<Integer>> res= new ArrayList<ArrayList<Integer>>();
        for (int i=0; i<A; i++) {
            // for each row make a *new* arraylist
            ArrayList<Integer> zero = new ArrayList<Integer>();
            // initialize that arraylist
            for (int j=0; j<A; j++) {
                zero.add(0);
            }
            // then add it to the row
            res.add(zero);
        }

        int top=0;
        int bottom =A-1;
        int left =0;
        int right =A-1;
        int cntr=0;
        while(top <= bottom || left <= right)
        {
            for(int i=top;i<=right;i++)
                res.get(top).set(i,++cntr);
                //arr[top][i] = ++cntr;
            top++;
            for(int i=top;i<=bottom;i++)
                 res.get(i).set(right,++cntr);
                // arr[i][right]=++cntr;
            right--;
            for(int i=right;i>=left;i--)
                res.get(bottom).set(i,++cntr);
                //arr[bottom][i]=++cntr;
            bottom--;
            for(int i=bottom;i>=top;i--)
                res.get(i).set(left,++cntr);
                //arr[i][left]=++cntr;
            left++;
        }
        return res;
    }
}
