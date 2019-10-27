package bitmagic;

public class CountBitsFlip {
    public static void main(String[] args) {
        System.out.println(countBitsFlip(20,25));
    }
    public static int countBitsFlip(int a, int b){
        int x = a ^ b;
        int count=0;
        while(x>0){
          count++;
          x = x & (x-1);
        }
        return count;
    }
}
