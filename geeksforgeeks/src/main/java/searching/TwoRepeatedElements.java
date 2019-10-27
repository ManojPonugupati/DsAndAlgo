package searching;

public class TwoRepeatedElements {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2};
        int n=2;
        twoRepeated(arr,n);
    }
    static void twoRepeated(int[] arr, int n){
         StringBuffer sb = new StringBuffer();
         for(int i=0;i<n+2;i++) {
             if(arr[Math.abs(arr[i])] > 0) {
                 arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
             } else
                 sb.append(Math.abs(arr[i]) + " ");

        }
        System.out.print(sb.toString());
    }
}

