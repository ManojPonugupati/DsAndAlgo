package arrays;

public class FirstAndSecondMax {

    public static void main(String[] args) {
        Integer[] arr = {1,10,2,3,4,5,6,7,8};
        int first_min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;
        System.out.println("first and second " + first_min + " " + second_min);
        for(int i=0;i<arr.length;i++){
            if(first_min > arr[i]) {
                second_min = first_min;
                first_min = arr[i];
            } else if(second_min > arr[i] && arr[i] != first_min){
                second_min = arr[i];
            }
        }
        System.out.println(first_min + " " + second_min);

    }
}
