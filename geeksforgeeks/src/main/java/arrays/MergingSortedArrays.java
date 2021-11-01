package arrays;

public class MergingSortedArrays {
    public static void main(String[] args) {
        int[] A ={4, 7, 9};
        int[] B ={2 ,11, 19};
        int a=0,b=0;
        int[] out = new int[A.length + B.length];
        for(int i=0;i<A.length+B.length;i++){
               if(a<A.length && b<B.length) {
                   if (A[a] < B[b]) {
                       out[i] = A[a];
                       a++;
                   } else {
                       out[i] = B[b];
                       b++;
                   }
               }else if(a<A.length)
               {
                   out[i] = A[a];
                   a++;
               } else {
                   out[i] = B[b];
                   b++;
               }
        }
        for(int i=0;i<out.length;i++){
            System.out.print(out[i] + " ");
        }
    }
}
