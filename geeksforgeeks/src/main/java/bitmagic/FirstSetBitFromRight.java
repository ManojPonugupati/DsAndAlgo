package bitmagic;
/*
    find first set bit from right side
 */

import static java.lang.Math.log;

public class FirstSetBitFromRight {
    public static void main(String[] args) {
        System.out.println(getFirstSetBitPos(0));
    }
    public static int getFirstSetBitPos(int n){
        int count=0;
        boolean numfound = false;
        if((n & 1) == 1)
            return 1;
        count++;
        while(n > 0 && !numfound ){
            if(((n>>1) & 1) == 1){
                numfound = true;
            }
            n=n>>1;
            count++;
        }
        if(!numfound)
            return 0;
        return count;
    }
}

/*
   1000

   1000
 */