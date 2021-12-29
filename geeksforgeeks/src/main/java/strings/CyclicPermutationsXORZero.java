package strings;

public class CyclicPermutationsXORZero {
    public static void main(String[] args) {
        String A = "1001";
        String B = "0011";
        String s = A+ "$"+B + B.substring(0,B.length()-1);
        int N=s.length();
        int[] z= new int[N];
        z[0]=N;
        int l=0,r=0;
        for(int i=1;i<N;i++){
            // outside the box
            if(i>r){
                l=i;
                r=i;
                while(r<N && s.charAt(r-l)==s.charAt(r))
                    r++;
                z[i]=r-l;
                r--;
            } else {
                // if it is not touching the boundary
                if(z[i-l] < r - i + 1){
                    z[i]=z[i-l];
                } else {
                    // touching the boundary or exceeding the bundary
                    l=i;
                    r++;
                    while(r<N && s.charAt(r-l)==s.charAt(r))
                        r++;
                    z[i]=r-l;
                    r--;
                }
            }
        }
        int cnt=0;
        for(int i=1;i<N;i++){
            if(z[i]==A.length())
                cnt++;
        }
    }
}
