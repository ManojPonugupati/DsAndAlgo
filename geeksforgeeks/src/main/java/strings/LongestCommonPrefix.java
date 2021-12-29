package strings;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] s = {"abcdefgh","aefghijk","abcefgh"};
        String common=s[0];
        for(int i=1;i<s.length;i++){
            int j=common.length();
            int k=s[i].length();
            int l=0;
            int min = j<k ? j : k;
            while(l < min && common.charAt(l) == s[i].charAt(l))
                l++;
            common = common.substring(0,l);
        }
        System.out.println(common);
    }
}
