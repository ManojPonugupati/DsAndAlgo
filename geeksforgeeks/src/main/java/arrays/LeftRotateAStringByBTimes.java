package arrays;

public class LeftRotateAStringByBTimes {
    public static void main(String[] args) {
        String S = "MANOJ";
        int B = 5;
        String out = S.substring(S.length() - B) + S.substring(0,S.length() - B);
        System.out.println(S.length() + " " + out);
    }
}
