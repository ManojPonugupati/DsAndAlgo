package strings;

public class ZAlgo {
    public static void main(String[] args) {
      //  String s = "xxyzxxyzwxxyzxxyzx";
        String s ="abcabcabcabc";
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
        for(int i=0;i<N;i++){
            System.out.print(z[i] + " ");
        }
    }
}
