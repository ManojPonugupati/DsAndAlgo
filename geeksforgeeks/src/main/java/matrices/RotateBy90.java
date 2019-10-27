package matrices;

public class RotateBy90 {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},
                {21,22,23,24,25}};
        rotateBy90(mat,mat.length);
    }
    public static void rotateBy90(int[][]mat,int n){
        mat = transpose(mat,n);
        int swap=0;
        if(n%2 == 0){
           for(int i=0;i<n/2;i++) {
               for (int j = 0; j <n; j++) {
                   swap = mat[i][j];
                   mat[i][j] = mat[n - i - 1][j];
                   mat[n - i - 1][j] = swap;
               }
           }
        }else {
            for(int i=0;i<=n/2;i++) {
                for (int j = 0; j < n; j++) {
                    swap = mat[i][j];
                    mat[i][j] = mat[n - i - 1][j];
                    mat[n - i - 1][j] = swap;
                }
            }
        }
    }
    public static int[][] transpose(int[][]mat,int n){
        int swap=0;
        for(int i=0;i<n;i++) {
            for (int j = i + 1; j < n; j++) {
                if (i == j) {
                    continue;
                } else {
                    swap = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = swap;
                }
            }
        }
           return mat;
    }
}
