package matrices;

public class ExchangeColumns {
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
        exchangeColumns(n1,m1,arr1);
    }
    static void exchangeColumns(int n1,int m1,int[][]arr1){
        int swap=0;
        for(int i=0;i<n1;i++){
            swap=arr1[i][0];
            arr1[i][0]=arr1[i][m1-1];
            arr1[i][m1-1]=swap;
        }
        System.out.println("exchanged");
        for(int i=0;i<n1;i++) {
            for (int j = 0; j < m1; j++) {
                System.out.print(arr1[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
