package stacks;

import com.sun.javafx.scene.control.skin.IntegerFieldSkin;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MaximumFrequencyStack {
    public static void main(String[] args) {
       // int[][] A ={{1,5},{1,7},{1,5},{1,7},{1,4},{1,5},{2,0},{2,0},{2,0},{2,0}};
        int[][] A = {{1,4},{2,0},{1,9},{2,0},{1,6},{1,6},{2,0}};
        int[] out = getMaxFreqArray(A);
        for(int i=0;i<out.length;i++){
            System.out.println(out[i] + " ");
        }
    }
    public static int[] getMaxFreqArray(int[][] A){
        int max_freq = 1;
        int[] out = new int[A.length];
        int elem=0;
        Map<Integer,Integer> hm = new HashMap<>();
        Map<Integer, Stack<Integer>> freq = new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(A[i][0] == 1){
                out[i]=-1;
                if(hm.containsKey(A[i][1])){
                   elem = hm.get(A[i][1]);
                   elem++;
                   max_freq = max_freq < elem ? elem : max_freq;
                   hm.put(A[i][1],elem);
                } else {
                    hm.put(A[i][1],1);
                    elem=1;
                }
                if(freq.containsKey(elem)){
                    Stack<Integer> stack = freq.get(elem);
                    stack.push(A[i][1]);
                    freq.put(elem,stack);
                } else
                {
                    Stack<Integer> stack = new Stack<>();
                    stack.push(A[i][1]);
                    freq.put(elem,stack);
                }
            } else if(A[i][0]==2){
                Stack<Integer> stack = freq.get(max_freq);
                int size = stack.size();
                out[i] = stack.pop();
                freq.put(max_freq,stack);
                if(size == 1 && max_freq > 1)
                    max_freq--;
                elem = hm.get(out[i]);
                elem--;
                hm.put(out[i],elem);
            }
        }
        return out;
    }
}
