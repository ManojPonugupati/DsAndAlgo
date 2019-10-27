package matrices;

public class InterchangeRows {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int n1 = arr1.length;
        int m1 = arr1[0].length;
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        interchangeRows(n1,m1,arr1);
    }
    static void interchangeRows(int n1,int m1,int[][]arr1){
        int swap=0;
        if(n1%2 == 0){
            for (int i = 0; i < n1/2; i++) {
                for (int j = 0; j < m1; j++) {
                    swap = arr1[i][j];
                    arr1[i][j] = arr1[n1- i -1][j];
                    arr1[n1 -i -1][j] = swap;
                }
            }
        }else {
            for (int i = 0; i <= n1/2; i++) {
                for (int j = 0; j < m1; j++) {
                    swap = arr1[i][j];
                    arr1[i][j] = arr1[n1 -i -1][j];
                    arr1[n1 -i -1][j] = swap;
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
