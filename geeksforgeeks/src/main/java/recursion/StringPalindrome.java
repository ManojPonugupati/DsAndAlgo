package recursion;

public class StringPalindrome {

    public static void main(String[] args) {
        String S = "RACECAR";
        String S2 = "RACEECAR";
        System.out.println(checkPalindrom(S2));
    }

    public static int checkPalindrom(String S){
        if(S.length() == 0 || S.length() == 1){
            return 1;
        }
        if (S.charAt(0) == S.charAt(S.length()-1)) {
            return checkPalindrom(S.substring(1, S.length() - 1));
        }
        return 0;

    }
}
