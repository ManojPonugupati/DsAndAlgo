package matrices;

public class BooleanMatrix {
    public static void main(String[] args) {
        int[][] arr1 = {{1,0,0,1},{0,0,1,0},{0,0,0,0}};
        int n1 = arr1.length;
        int m1 = arr1[0].length;
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                System.out.print(arr1[i][j]  + " ");
            }
            System.out.println();
        }
        booleanMatrix(n1,m1,arr1);
    }
    static void booleanMatrix(int n1,int m1,int[][]arr1){
        StringBuffer sb = new StringBuffer();
        int[] row = new int[n1];
        int[] col = new int[m1];
        for(int i=0;i<n1;i++){
            row[i]=0;
        }
        for(int j=0;j<m1;j++){
            col[j]=0;
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                if(arr1[i][j] ==1){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                if(row[i] ==1 || col[j]==1){
                    arr1[i][j]=1;
                }
            }
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                sb.append(arr1[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
