package contest;

import java.util.Arrays;

public class MaximumPoints {
    public static void main(String[] args) {
        int[] A = {1,0,1};
        int[] B = {30,12,8};
        int[] m_0= new int[A.length+1];
        int[] b_1 = new int[A.length+1];
        Arrays.fill(m_0,0);
        Arrays.fill(b_1,0);
        for(int i=1;i<=A.length;i++){
            if(A[i-1]==0){
                m_0[i] = m_0[i-1]+B[i-1];
                b_1[i]=b_1[i-1];
            } else {
                b_1[i] = b_1[i-1]+B[i-1];
                m_0[i]=m_0[i-1];
            }
        }
        for(int i=1;i<=A.length;i++){
            System.out.println(m_0[i] + " " + b_1[i]);
        }
        int out =0;
        System.out.println("result is : ");
        if(m_0[A.length] > b_1[A.length] )
            System.out.println(m_0[A.length]);
        for(int i=A.length;i>0;i--){
            System.out.println("diff is : " + (m_0[i]-m_0[i-1])  +  "" +
                    (b_1[i]-b_1[i-1]) + " " );
            if(m_0[i]-m_0[i-1] < b_1[i]-b_1[i-1]){
                out = out + b_1[i] - b_1[i-1];
            } else if(m_0[i] > b_1[i]) {
                out = out+m_0[i];
                break;
            }

        }
        System.out.println("final is : " + out);
    }
}
