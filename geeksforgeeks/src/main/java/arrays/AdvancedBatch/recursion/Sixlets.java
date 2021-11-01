package arrays.AdvancedBatch.recursion;

public class Sixlets {
    public static void main(String[] args) {
        int[] A = {400,500,300,800,100};
        int B=3;
        System.out.println(sixlets(A,B));
    }

    public static int sixlets(int[] A,int B){
        int i=0,sum=0,cnt=0;
        return caclSixlets(i,sum,cnt,A,B);
    }
    public static int caclSixlets(int i, int sum, int cnt, int[] A, int B){

        if(sum>1000) return 0;
        if(cnt == B) return 1;
        if(i== A.length) return 0;
        return caclSixlets(i+1,sum+A[i],cnt+1,A,B) + caclSixlets(i+1,sum,cnt,A,B);
    }
}
