package arrays;

public class PascalTriangle {
    public static void main(String[] args) {
        int A=4;
        int[] test = new int[A+1];
        for(int i=0;i<test.length;i++){
             test[i]=1;
            }
      for(int i=1;i<A;i++){
          for(int j=i;j>0;j--){
              test[j] = test[j]+test[j-1];
          }
      }
      for(int i=0;i<test.length;i++){
          System.out.print(test[i] + " ");
      }
    }
}
