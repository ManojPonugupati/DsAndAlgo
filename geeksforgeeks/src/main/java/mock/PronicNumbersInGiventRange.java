package mock;

public class PronicNumbersInGiventRange {
    public static void main(String[] args) {
        int A=2,B=20;
        int i = (int) Math.sqrt(A);
        int j = (int) Math.sqrt(B);
        int out = 0;
        System.out.println(i + " " + j);
        for(int k=i;k<=j;k++){
            if(k*(k+1) >= A && k*(k+1) <= B)
                out++;
        }
        
        System.out.println(out);

    }
}
