package arrays;

import java.util.Arrays;

public class AddOneToNumber {
    static boolean all9s =false;
    public static void main(String[] args) {
        int[] A = { 0, 3, 7, 6, 4, 0, 5, 5, 5 };
        int out_len = getLen(A);
        System.out.println("outlength is : " + out_len);
        int[] out = new int[out_len];
        Arrays.fill(out,0);
        int j=out_len-1;
        int cnt=0;
        if(all9s){
            out[0]=1;
        } else {
            for(int i=A.length-1;i>=A.length-out_len;i--){
                if(A[i]==9) {
                    --j;
                    cnt++;
                }
                else {
                    out[j]=A[i]+1;
                    --j;
                    cnt++;
                    break;
                }
            }
        }
        for(int i=A.length-1-cnt;i>=0 && !all9s && j>=0 ; i--,--j){
            out[j]=A[i];
        }

        for(int i=0;i<out.length;i++){
            System.out.print(out[i] + " ");
        }
    }
    public static  int getLen(int[] A){
        int len=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==0)
                ++len;
            else break;
        }
        checkForAll9s(A,len);
        int out_len=0;
        if(all9s)
            out_len=A.length - len + 1;
        else out_len = A.length - len;
        return out_len;
    }
    public static void checkForAll9s(int[] A,int len){
        for(int i=len;i<A.length;i++){
            if(A[i] !=9)
                break;
            else if(A[i]==9 ){
                if(i==A.length-1)
                    all9s=true;
            }
        }
    }
}


