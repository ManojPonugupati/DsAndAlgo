package arrays;

public class IsAlphaNum {
    public static void main(String[] args) {
        char[] arr = {'S', 'c', 'a', 'l', 'e', 'r', '2', '0', '2', '0'};
        int ret_valu=0;
        for(int i=0;i<arr.length;i++){
            if(((int)arr[i] > 64 && (int)arr[i] < 91)
                    || ((int)arr[i] > 96 && (int)arr[i] < 123)
                    || ((int)arr[i] > 47 && (int)arr[i] < 58)    )
            {
                continue;
            } else {
                ret_valu=100;
                break;
            }
        }
        System.out.println(ret_valu);
    }
}
