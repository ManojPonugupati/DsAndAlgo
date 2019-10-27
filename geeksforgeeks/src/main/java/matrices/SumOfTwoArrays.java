package matrices;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        int[][] arr1 = {{4,8},
                {0,2},
                {1,6}};
        int[][] arr2 = {{5,2},{9,4}};
        int n1=arr1.length;
        int m1=arr1[0].length;
        int n2=arr2.length;
        int m2 =arr2[0].length;
      //  sumMatrix(n1,m1,n2,m2,arr1,arr2);
       // upperAndLowerTriangleSum(arr1);
        multiplyMatrix(n1,m1,n2,m2,arr1,arr2);
    }
    static void sumMatrix(int n1, int m1, int n2, int m2, int arr1[][], int arr2[][]){
        if((n1 !=m1) || (n2 !=m2)) {
            System.out.println("-1");
            return;
        }
        StringBuffer sb = new StringBuffer();

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                arr1[i][j] +=arr2[i][j];
            }
        }
        for (int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                sb.append(arr1[i][j] +" ");
            }
        }
        System.out.print(sb.toString());
    }
    static void upperAndLowerTriangleSum(int[][] arr1) {
        int upperSum = 0;
        int lowerSum = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i; j < arr1[0].length; j++) {
                upperSum += arr1[i][j];
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j <= i; j++) {
                lowerSum += arr1[i][j];
            }
        }
        System.out.println(upperSum + " " + lowerSum);
    }
    static void multiplyMatrix(int n1, int m1, int n2, int m2, int arr1[][], int arr2[][]){
       if (m1 != n2) {
           System.out.println("-1");
           return;
       }
        int[][] arr3 = new int[n1][m2];
       for(int i=0; i<arr1.length;i++){
           for(int j=0;j<arr2[0].length;j++){
               for(int k=0;k<arr2[0].length;k++)
             arr3[i][j] += arr1[i][k]*arr2[k][j];
           }
       }
       for(int i=0;i<arr3.length;i++){
           for(int j=0;j<arr3[0].length;j++){
               System.out.print(arr3[i][j] + " ");
           }
       }
    }
}
