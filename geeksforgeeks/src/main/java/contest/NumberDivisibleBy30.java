package contest;

public class NumberDivisibleBy30 {
    public static void main(String[] args) {
        String s = "30303030";
        System.out.println(getDivBy30OrNot(s));
    }
    public static int getDivBy30OrNot(String s){
        int n = s.length();
        int digitSum=0;
        if(s.charAt(n-1)=='0'){
            for(int i=0;i<n-1;i++){
                digitSum +=(s.charAt(i)-'0');
            }
            if(digitSum%3==0)
                return 1;
        }

        return 0;
    }
}
