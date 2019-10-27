package arrays;

public class TrapingRainWater {
    public static void main(String[] args) {
        int[] arr = {1,0,4,2,5,0,6,4,0,5};
        System.out.println(trapped(arr,arr.length));
    }
    static int trapped(int[] arr, int n){
        {
            // initialize output
            int result = 0;

            // maximum element on left and right
            int left_max = 0, right_max = 0;

            // indices to traverse the array
            int lo = 0, hi = n-1;

            while(lo <= hi)
            {
                if(arr[lo] < arr[hi])
                {
                    if(arr[lo] > left_max)

                        // update max in left
                        left_max = arr[lo];
                    else

                        // water on curr element =
                        // max - curr
                        result += left_max - arr[lo];
                    lo++;
                }
                else
                {
                    if(arr[hi] > right_max)

                        // update right maximum
                        right_max = arr[hi];

                    else
                        result += right_max - arr[hi];
                    hi--;
                }
            }

            return result;
        }
    }
}
