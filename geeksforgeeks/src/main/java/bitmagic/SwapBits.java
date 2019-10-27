package bitmagic;

public class SwapBits {
    public static void main(String[] args) {
        System.out.println(swapBits(23));
    }
    public static int swapBits(int n){
       int eve = n & 0xAAAAAAAA;
       int odd = n & 0x55555555;
       eve = eve >>1;
       odd = odd <<1;
        return  eve | odd;
    }
}
