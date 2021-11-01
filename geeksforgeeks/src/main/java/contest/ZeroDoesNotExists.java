package contest;

public class ZeroDoesNotExists {
    public static void main(String[] args) {
        int x=99999889;
        System.out.println(getNextNumWithOutZero(x));
    }
    public static String getNextNumWithOutZero(int x){
        String sum="";
        String s = String.valueOf(x);
        for(int i=0;i<s.length();i++){
            if(s.charAt(s.length()-i-1)=='9' && i==0) {
                sum = sum + "2";
            } else if(s.charAt(s.length()-i-1)=='9' && i>0){
                if(s.charAt(s.length()-i)=='9'){
                    sum = "1" + sum;
                } else if(s.charAt(s.length()-i)=='0'){
                    sum="2"+sum;
                }
            } else if(s.charAt(s.length()-i-1)=='0' && i>0){
                if(s.charAt(s.length()-i)=='9'){
                    sum = "0" + sum;
                } else if(s.charAt(s.length()-i)=='0'){
                    sum ="1" + sum;
                }
            }

            else if(i==0)
            {
                int ret = Integer.valueOf(s.replaceAll("0","1")) + 1;
                return String.valueOf(ret);
            }
            else break;
        }
        int total = x+ Integer.valueOf(sum);
        return String.valueOf(total);
    }
}
