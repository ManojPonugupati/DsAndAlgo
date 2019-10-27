package bitmagic;

public class MaxAndValue {
    public static void main(String[] args) {
        int[] arr = {4,8,12,16};
        int n = arr.length;
        System.out.println(maxAND(arr,n));
    }
    public static int maxAND(int arr[],int n){
      int res =0; int count=0;
        for(int bit=31;bit>=0;bit--){
            count = checkMSB((res |(1<<bit)),arr,n);
            if(count >=2){
                res = res | (1<<bit);
            }
        }
      return res;
    }
    static int checkMSB(int res,int[] arr,int n){
        int count=0;
        for(int i=0;i<n;i++){
           if((res & arr[i]) == res){
               count++;
           }
        }
        return count;
    }
}
