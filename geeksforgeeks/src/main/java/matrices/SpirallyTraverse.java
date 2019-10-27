package matrices;

public class SpirallyTraverse {
    public static void main(String[] args) {
        int[][]arr1= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int n1 = arr1.length;
        int m1 = arr1[0].length;
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        spirallyTraverse(arr1,n1,m1);

    }
    static void spirallyTraverse(int[][]arr1,int n1, int m1){
        int c_init=0;int c_end=m1;int r_init=0;int r_end=n1;
        StringBuffer sb = new StringBuffer();
        while(c_init<c_end && r_init < r_end){
            for(int i=c_init;i<c_end;i++){
                sb.append(arr1[r_init][i] + " ");
            }
            r_init++;
            for(int i=r_init;i<r_end;i++){
                sb.append(arr1[i][c_end-1] + " ");
            }
            c_end--;
            if(r_init < r_end) {
                for (int i = c_end - 1; i >= c_init; i--) {
                    sb.append(arr1[r_end - 1][i] + " ");
                }
            }
            r_end--;
            if(c_init < c_end) {
                for (int i = r_end - 1; i >= r_init; i--) {
                    sb.append(arr1[i][c_init] + " ");
                }
            }
            c_init++;
        }
        System.out.print(sb.toString());
    }
}
