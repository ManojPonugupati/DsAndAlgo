package arrays.AdvancedBatch;

public class Add1ToTheNumber {
    public static void main(String[] args) {
        int[] A = {0, 0, 4, 4, 6, 0, 9, 6, 5, 1};
        //int[] A ={0};
        int[] out = plusOne(A);
        for(int i=0;i<out.length;i++)
            System.out.print(out[i] + " ");
    }

    public static int[] plusOne(int[] A){
        int init = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]==0)
                init++;
            else break;
        }
        int[] edge_out={1};
        if(init==1 && A.length==1){
            return edge_out;
        }
        boolean carry = true;
        int i=A.length-1;
        String str="";
        while(i>=init){
            if(A[i] == 9 && carry){
                str=0+str;
            } else if(carry)
            {
                A[i] = A[i] + 1;
                str = A[i]+str;
                carry=false;
            } else
            {
                str =A[i] + str;
            }
           i--;
        }
        if(carry)
            str = 1+str;
        int[] out = new int[str.length()];
        for(int j=0;j<out.length;j++){
            out[j] = (int) str.charAt(j)-48;
        }
        return out;
    }
}
