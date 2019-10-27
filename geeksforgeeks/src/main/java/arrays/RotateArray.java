package arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = rotate(arr,arr.length,3);
        for(int i:arr2){
            System.out.printf(i +" "    );
        }
    }
    public static int[] rotate(int[] arr,int n,int d){
        int[] temp = new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for(int i=d,l=0;i<n;i++,l++){
            arr[l]= arr[i];
        }

        for(int i= n-d,l=0;i<n;i++,l++){
            arr[i] = temp[l];
        }
        return arr;
    }
}
