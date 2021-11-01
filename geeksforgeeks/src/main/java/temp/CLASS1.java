package temp;

public class CLASS1 {
    public static void main(String[] args) {
        int[][] a ={{2,3,4},{5,6,7}};
        int n=a.length;
        int m=a[0].length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               sum+= a[i][j]*(i+1)*(n-i)*(j+1)*(m-j);
            }
        }
        System.out.println(sum);
    }
}
