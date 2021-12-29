package strings;

public class SubStringsContainingA {
    public static void main(String[] args) {
        String A ="fnmzxvozgkpkwuuwbnlbajogijoaxipjwwfaqefjnvfbcilerkdaeysamehgdouvspojtuvh";
        int cnt=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='a')
                cnt++;
        }
        System.out.println(cnt*(cnt+1)/2);
    }
}
