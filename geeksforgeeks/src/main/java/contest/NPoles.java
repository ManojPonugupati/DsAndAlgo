package contest;

import java.util.HashMap;
import java.util.Map;

public class NPoles {
    public static void main(String[] args) {
        int[] A = {120,131,101,30,17,127,55,35};
    //A=120,131,101,30,17,127,55,35,45,50,64,62,96,92,63,76,25,52,85,75
        int p1=0;int p2=1;
        int fact=0;int cnt=0;
        while(p1 < A.length && p2 < A.length){
            if(A[p1] > A[p2]){
                fact++;
                p2++;
            } else if(A[p1] <= A[p2]){
                fact++;
                cnt = cnt + fact + (p2 - p1 -1);
                fact=0;
                p1=p2;p2++;
            }
        }
        System.out.println("cnt : " + cnt + " fact : " + fact + " p2 : " + p2 + " p1 : " + p1);
        if(fact > 0){
            cnt = cnt + fact + (p2 - p1 -1);
        }
        System.out.println();
        System.out.println(cnt);
    }
}
