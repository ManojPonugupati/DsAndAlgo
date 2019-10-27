package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1};
        int find=4;
        System.out.println(search(arr,arr.length,find));
    }
    static int search(int[] arr,int n,int x){
        for(int i=0;i<n;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}
