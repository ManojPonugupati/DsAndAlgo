package strings;

public class ZAlgoBruteForce {
    public static void main(String[] args) {
        String s = "xxyzxxyzwxxyzxxyzx";
        int N=s.length();
        int[] z = new int[N];
        z[0]=s.length();
        for(int i=1;i<N;i++){
            int j=0;
            while(i+j<N && s.charAt(i+j)==s.charAt(j)){
                j++;
            }
            z[i]=j;
        }
        for(int i=0;i<N;i++)
            System.out.print(z[i] + " ");
    }
}
