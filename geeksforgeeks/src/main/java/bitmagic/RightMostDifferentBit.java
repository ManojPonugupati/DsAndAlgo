package bitmagic;

public class RightMostDifferentBit {

    public static void main(String[] args) {
        System.out.println(posOfRightMostDiffBit(4,52));
    }
    public static int posOfRightMostDiffBit(int m, int n){
        int a = m ^ n;
        if((a & 1) == 1){
            return 1;
        }
        boolean difffound=false;
        int count=1;
        while((a>0 && !difffound)){
            if(((a>>1) & 1) == 1) {
                difffound=true;
            }
            a=a>>1;
            count++;
        }
        if(!difffound)
            return -1;
      return count;
    }
}
