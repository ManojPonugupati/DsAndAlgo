package arrays;

public class LeftRotations {
    public static void main(String[] args) {
        int[] A= {1,2,3,4,5};
        int[] B={2,3};
        int[][] out = new int[B.length][A.length];
        for(int i=0;i<B.length;i++){
            int cnt=0;
            for(int j=B[i]%A.length;j<A.length;j++){
                out[i][j-(B[i]%A.length)] = A[j];
                cnt++;
            }
            for(int j=0;j<B[i]%A.length;j++){
                out[i][cnt]=A[j];
                cnt++;
            }
        }
        for(int i=0;i<out.length;i++){
            for(int j=0;j<out[0].length;j++){
                System.out.print(out[i][j] +" ");
            }
            System.out.println();
        }
    }
}
