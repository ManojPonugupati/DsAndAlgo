package matrices;

public class ReverseCol {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3,4},{4,5,6,7},{7,8,9,10},{10,11,12,13}};
        int n1=arr1.length;
        int m1 = arr1[0].length;
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        reverseCol(n1,m1,arr1);
    }
    static void reverseCol(int n1,int m1,int[][]arr1){
        int swap=0;
        if(m1%2 ==0) {
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m1 / 2; j++) {
                    swap = arr1[i][j];
                    arr1[i][j] = arr1[i][m1 - j - 1];
                    arr1[i][m1 - j - 1] = swap;
                }
            }
        } else {
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j <= m1 / 2; j++) {
                    swap = arr1[i][j];
                    arr1[i][j] = arr1[i][m1 - j - 1];
                    arr1[i][m1 - j - 1] = swap;
                }
            }
        }

        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
