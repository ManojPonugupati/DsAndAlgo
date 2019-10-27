package matrices;

public class BoundaryTraversal {
    public static void main(String[] args) {
       // int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        //int[][]a ={{5},{17}};
        int[][]a={{22},{3},{21},{2}};
        int n1=a.length;
        int m1 =a[0].length;
        System.out.println(n1 + " " + m1);
        boundaryTraversal(n1,m1,a);
    }
    static void boundaryTraversal(int n1,int m1,int[][]a){
       StringBuffer sb = new StringBuffer();
       for(int i=0;i<m1;i++){
           sb.append(a[0][i] + " ");

       } //1 2 3 4
        System.out.println("1" + sb.toString());
       for(int i=1;i<n1;i++){
           sb.append(a[i][m1-1] + " ");
       } //8 12
        System.out.println("2" + sb.toString());
       if(n1>1 & m1 >1) {
           for (int i = m1 - 2; i >= 0; i--) {
               sb.append(a[n1 - 1][i] + " ");
           }

           System.out.println("3" + sb.toString());
           for (int i = n1 - 2; i > 0; i--) {
               sb.append(a[i][0]);
           }
       }
        System.out.println("4" + sb.toString());
        System.out.print(sb.toString());
    }
}
