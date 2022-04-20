package bitmagic;

public class AddBinaryStrings {
    public static void main(String[] args) {
        String A = "11111";
        String B = "111";
        StringBuffer sb = new StringBuffer();
        int max = (A.length() > B.length()) ? A.length():B.length();
        int min = (A.length() < B.length()) ? A.length():B.length();
        String app = (A.length() < B.length()) ? A:B;
        String max_string = (A.length() < B.length()) ? B:A;
        for(int i=0;i<(max - min);i++){
            sb.append('0');
        }
        int carry=0;
        sb.append(app);
        app = sb.toString();
        int sum=0;
        sb= new StringBuffer();
        for(int i=max-1;i>=0;i--){
             int one = Character.getNumericValue(max_string.charAt(i));
             int two = Character.getNumericValue(app.charAt(i));
             sum = one + two + carry;
            if(sum<=1)
                 carry=0;
            else carry=1;
            if(sum==1 || sum == 3)
                sb.append('1');
            else sb.append('0');
        }
        if(carry > 0)
            sb.append(carry);
        System.out.println(sb.reverse().toString());
    }
}
