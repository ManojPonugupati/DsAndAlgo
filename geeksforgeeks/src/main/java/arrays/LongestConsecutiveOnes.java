package arrays;

public class LongestConsecutiveOnes {
    public static void main(String[] args) {
        String A = "01";
        System.out.println(solve(A));
    }
    public static int solve(String A){
        char[] ch = new char[A.length()];
        for(int i=0;i<A.length();i++){
            ch[i]=A.charAt(i);
        }
        int[] left_ar = new int[A.length()];
        int[] right_ar = new int[A.length()];
        int counter=0;

        left_ar[0]=0;
        for(int i=1;i<A.length();i++) {
            if (ch[i - 1] == '0') {
                left_ar[i] = 0;
                counter = 0;
            } else
                left_ar[i] += ++counter;
        }
        counter=0;
        right_ar[A.length()-1]=0;
        for(int i=A.length()-2;i>=0;i--){
            if(ch[i+1] == '0'){
                right_ar[i] = 0;
                counter=0;
            }else
                right_ar[i] += ++counter;
            }
        for(int i=0;i<A.length();i++){
            System.out.print(left_ar[i] + " ");
        }
        System.out.println();
        for(int i=0;i<A.length();i++){
            System.out.print(right_ar[i] + " ");
        }
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<A.length();i++){
            if(left_ar[i]+ right_ar[i] > max_sum)
                max_sum = left_ar[i] + right_ar[i];
        }
        int total_num_of_ones=0;
        for(int i=0;i<A.length();i++){
          if(ch[i]=='1')
            ++total_num_of_ones;
        }
        System.out.println("tot : " + total_num_of_ones + " " + max_sum);
        if(total_num_of_ones <= max_sum)
        return max_sum;

        return max_sum+1;
    }
}
