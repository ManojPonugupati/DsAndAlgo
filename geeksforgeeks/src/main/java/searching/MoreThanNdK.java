package searching;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MoreThanNdK {
    public static void main(String[] args) {
        int[] arr ={2,2,2,3,3,3,4,3,4,3,3,3,2,2,1,5,6,7,8};
        int k=4;
        moreThanNdK(arr,k);
    }
    public static void moreThanNdK(int[]arr,int k){
        int N = arr.length/k;
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        Set<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            if(hm.get(arr[i]) == null){
                hm.put(arr[i],1);
            }else {
                int num =0;
                num = hm.get(arr[i]);
                num++;
                hm.put(arr[i],num);
            }
        }
        for(int i=0;i<arr.length;i++){
            if (hm.get(arr[i]) > N){
                hs.add(arr[i]);
            }
        }
        int count =0;
        for(Integer elem : hs){
            count++;
        }
        System.out.println(count);
    }
}
