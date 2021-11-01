package arrays;

public class ExcelColumnNumber {

    public static void main(String[] args) {
        String s = "ABCD";
        System.out.println(s.length());
        int out_sum =0;
        System.out.println(s.charAt(1));

        for(int i=0;i<s.length();i++){

            out_sum += ((int)s.charAt(i) - 64)*Math.pow(26,s.length()-i-1);
        }
        System.out.println(out_sum);
    }

}
