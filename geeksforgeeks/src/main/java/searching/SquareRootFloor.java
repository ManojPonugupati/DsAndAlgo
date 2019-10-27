package searching;

public class SquareRootFloor {
    public static void main(String[] args) {

      for(int x=0;x<=100;x++);
        System.out.println(44444444 + " sqrrt is " + squareRootFloor(44444444));
    }
    static long squareRootFloor(int x){
        long low =0;
        long mid = x/2;
        long high = x;
        while (low <= high){
            if(mid * mid == x){
                return mid;
            } else {
                if(mid * mid < x){
                    low = mid + 1;
                    mid = low + (high - low)/2;
                }else
                    {
                    high = mid -1;
                    mid = low + (high - low)/2;
                }
            }
        }

        return mid-1;
    }

}
