package contest;

import java.util.Arrays;

public class MagicalStringPrefixes {
    public static void main(String[] args) {
        String A = "he";
        int B=11;
        int C=5;
        int[] od_arr = new int[26];
        int[] ev_arr = new int[26];
        for(int i=0;i<A.length();i++){
            od_arr[(int) A.charAt(i)- 97] +=1;
        }
        for(int i=0;i<26;i++) {
            System.out.print(od_arr[i] + " ");
        }
        StringBuilder lex = new StringBuilder();
        for(int i=0;i<26;i++){
            int cnt=1;
           while(cnt <= od_arr[i]){
               lex.append(Character.toString((char) (97 +i)));
               cnt++;
           }
        }
        System.out.println("lex is : " + lex );
        StringBuilder sb = new StringBuilder(A);
        System.out.println(lex);
        int cnt=0;
        Arrays.fill(od_arr,0);
        Arrays.fill(ev_arr,0);
        int sum=0;
        for(int j=0;j<B;j++) {
            for (int i = 0; i < A.length(); i++) {
                if(j%2 !=0){
                    if((i+1)%2 !=0) {
                        if (ev_arr[(int) lex.charAt(i) - 97] == 0) {
                            sum = sum + 1;
                            sum = sum%1000000007;
                            od_arr[(int) lex.charAt(i) - 97] += 1;
                            od_arr[(int) lex.charAt(i) - 97] = od_arr[(int) sb.charAt(i) - 97]%1000000007;
                        } else if (ev_arr[(int) lex.charAt(i) - 97] > 0) {
                            sum = sum - 1;
                            ev_arr[(int) lex.charAt(i) - 97] -= 1;
                        }
                    }
                    else {
                        if (od_arr[(int) sb.charAt(i) - 97] == 0) {
                            sum = sum + 1;
                            sum = sum%1000000007;
                            ev_arr[(int) sb.charAt(i) - 97] += 1;
                            ev_arr[(int) sb.charAt(i) - 97] = ev_arr[(int) sb.charAt(i) - 97]%1000000007;
                        } else if(od_arr[(int) sb.charAt(i) - 97] > 0){
                            sum = sum-1;
                            od_arr [(int) sb.charAt(i) - 97] -= 1;
                        }
                    }
                } else
                if ((i + 1) % 2 != 0) {
                    if (ev_arr[(int) sb.charAt(i) - 97] == 0) {
                        sum = sum + 1;
                        sum = sum % 1000000007;
                        od_arr[(int) sb.charAt(i) - 97] += 1;
                        od_arr[(int) sb.charAt(i) - 97] = od_arr[(int) sb.charAt(i) - 97] % 1000000007;
                    } else if (ev_arr[(int) sb.charAt(i) - 97] > 0) {
                        sum = sum - 1;
                        ev_arr[(int) sb.charAt(i) - 97] -= 1;
                    }
                } else {
                    if (od_arr[(int) sb.charAt(i) - 97] == 0) {
                        sum = sum + 1;
                        sum = sum % 1000000007;
                        ev_arr[(int) sb.charAt(i) - 97] += 1;
                        ev_arr[(int) sb.charAt(i) - 97] = ev_arr[(int) sb.charAt(i) - 97] % 1000000007;
                    } else if (od_arr[(int) sb.charAt(i) - 97] > 0) {
                        sum = sum - 1;
                        od_arr[(int) sb.charAt(i) - 97] -= 1;
                    }
                }
                if (sum == C)
                    cnt++;
                cnt %= 1000000007;
            }
        }

        System.out.println("count is : " + cnt);
    }
}
