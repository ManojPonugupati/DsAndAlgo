package stringmatching;

public class ZAlgo {
    public static void main(String[] args) {
        String string = "xxyxxyxxaxxyxxz";
        char[] s = new char[string.length()];
        int L=0,R=0,N=string.length();
        for(int i=0;i<string.length();i++){
            s[i] = string.charAt(i);
        }
        int[] z = new int[string.length()];
        z[0]=N;
        int j=0;
        for(int i=1;i<N;i++){
            if(i>R){
                L=i;R=i;
                while(R<N && s[R-L] == s[R]){
                    R++;
                }
                z[i]=R-L;
                R--;
            }
            else {
                j=i-L;
                if(z[j] < R - i + 1){
                    z[i]=z[j];
                }
                else {
                    L=i;
                    R++;
                    while(R<N && s[R-L] == s[R]){
                        R++;
                    }
                    z[i]=R-L;
                    R--;
                }


            }
        }
        for(int i=0;i<z.length;i++){
            System.out.print(z[i] + " ");
        }
    }
}
