package sorting;

public class UnionOfSortedArrays {
    public static void main(String[] args) {
      //  int[] arr1 = {1,2,3,4,5,6,7,8,9};
      //  int[] arr2 = {5,6,7,8,9,10,11,12,13};
        int[] arr1 = {2,2,3,4,5};
        int[] arr2 = {1,1,2,3,4};
        findUnion(arr1,arr2,arr1.length,arr2.length);
    }
    static void findUnion(int[] arr1,int[] arr2,int n, int m){
        int i=0,j=0,k=0;int last_arr1 = Integer.MIN_VALUE;
        int last_arr2 = Integer.MIN_VALUE;
        StringBuffer sb = new StringBuffer();
        while(i<n && j<m){
            if(arr1[i] < arr2[j]){
                if(arr1[i] > last_arr1) {
                    sb.append(arr1[i] + " ");
                    last_arr1 = arr1[i];
                }
                i++;
            } else if (arr1[i] > arr2[j]){
                if(arr2[j] > last_arr1) {
                    sb.append(arr2[j] + " ");
                    last_arr1 = arr2[j];
                }
                j++;
            } else {
                if(arr1[i] > last_arr1) {
                    sb.append(arr1[i] + " ");
                    last_arr1 = arr1[i];
                }
                i++;
                j++;
            }
        }
        while(i<n){
            if(arr1[i] > last_arr1) {
                sb.append(arr1[i] + " ");
                last_arr1 = arr1[i];
            }
            i++;
        }
        while(j<m){
            if(arr2[j] > last_arr1) {
                sb.append(arr2[j] + " ");
                last_arr1 = arr2[j];
            }
            j++;
        }
        System.out.print(sb.toString());
    }
}
