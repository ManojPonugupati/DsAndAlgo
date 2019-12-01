package sorting;

public class IntersectionOfSortedArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int[] arr2 = {5,6,7,8,9,10,11,12,13};
        int i=0;int j=0;
        int last_elem = Integer.MIN_VALUE;
        StringBuffer sb = new StringBuffer();
        boolean matched = false;
        while(i< arr.length && j< arr2.length){
            if(arr[i] < arr2[j]){
                i++;
            }else if(arr[i] > arr2[j]){
                j++;
            }else
            {
                if(arr[i] > last_elem) {
                    sb.append(arr[i] + " ");
                    last_elem = arr[i];
                }
                 i++;
                 j++;
                 matched = matched || (!matched);
            }
        }
        if(matched) {
            System.out.print(sb.toString());
        } else
        {
            System.out.print("-1");
        }
    }
}
