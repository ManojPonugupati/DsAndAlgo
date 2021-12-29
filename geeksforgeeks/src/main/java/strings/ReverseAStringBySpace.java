package strings;


public class ReverseAStringBySpace {
    public static void main(String[] args) {
        String s ="     the   sky   is   blue     ";
        // expected output in this case is  "blue is sky the"
        String[] out = s.trim().split(" +");
        s="";
        for(int i=0;i<out.length;i++){
            System.out.println("Manoj + : " + out[i]);
            s=s+" " +out[out.length-i-1];
        }
        System.out.println(s.trim());
    }
}
