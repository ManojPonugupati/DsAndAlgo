package matrices;

public class MinOpsNeedToBeautifyMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{3,2,1},{1,2,3}};
        int n = mat.length;
        System.out.println(opsNeeded(n,mat));
    }
    static int opsNeeded(int n,int[][]mat){
        int[] rowSum = new int[n];
        int[] colSum = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rowSum[i]+= mat[i][j];
                colSum[j] += mat[i][j];
            }
        }
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
            maxSum = Math.max(maxSum,rowSum[i]);
        for(int i=0;i<n;i++)
            maxSum=Math.max(maxSum,colSum[i]);

        int minOps=0;
        for(int i=0,j=0;i<n && j<n;){
            int diff = Math.min(maxSum - rowSum[i], maxSum-colSum[j]);
            mat[i][j]+=diff;
            rowSum[i]+=diff;
            colSum[j]+=diff;
            minOps+=diff;
            if(rowSum[i] == maxSum){
                i++;
            }
            if(colSum[j] == maxSum)
                j++;
        }
        return minOps;
    }
}
