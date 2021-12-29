package strings;

public class PeriodOfAString {
    public static void main(String[] args) {
        String A ="abcaabcaab";
        int l=0,r=0;
        int N=A.length();
        int[] z = new int[N];
        z[0]=N;
        for(int i=1;i<N;i++){
            if(i>r){
                l=i;
                r=i;
                while(r<N && A.charAt(r)==A.charAt(r-l))
                    r++;
                z[i]=r-l;
                r--;
            }
            else {
                if(z[i-l] < r-i+1)
                    z[i]=z[i-l];
                else {
                    l=i;
                    r++;
                    while(r<N && A.charAt(r)==A.charAt(r-l))
                        r++;
                    z[i]=r-l;
                    r--;
                }
            }
        }
        int period=0;
        for(int i=0;i<N;i++){
            System.out.print(z[i]+" ");
        }
        System.out.println();
        for(int i=1;i<N && period==0;i++)
            if(i+ z[i] == N) {
                period = i;
            }

        System.out.println(period);
    }
}
