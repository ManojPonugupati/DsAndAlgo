package matrices;

public class SearchinMat {
    public static void main(String[] args) {
        int[][] arr1 = {{3,30,38},{44,52,54},{57,60,69}};
        int n1=arr1.length;
        int m1 = arr1[0].length;
        int x=2;
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(searchinMat(n1,m1,arr1,x));
    }
    static int searchinMat(int n1,int m1,int[][]arr1,int x){
        boolean searchEnd=false;
        int c_init=0;int c_end=m1-1;int r_init=0;int r_end=n1-1;int i=0;
        boolean elemfound=false;
        while(!(searchEnd || elemfound) ){
            if(arr1[r_init][c_end] == x){
                elemfound=true;
            }else {
                if(arr1[r_init][c_end] < x){
                    r_init++;
                }else {
                    if(arr1[r_init][c_end] > x){
                        c_end--;
                    }

                }
            }
            if((r_init > r_end) || (c_init > c_end) ){
                searchEnd=true;
            }
        }
        if(elemfound) {
            return 1;
        } else {
            return 0;
        }

    }
}
