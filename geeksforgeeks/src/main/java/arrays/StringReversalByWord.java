package arrays;

public class StringReversalByWord {
    public static void main(String[] args) {
        String s = "       fwbpudnbrozzifml    osdt ulc jsx kxorifrhubk ouhsuhf sswz qfho dqmy sn myq igjgip iwfcqq";
        System.out.println(reverseTheString(s));
    }

    public static String reverseTheString(String  A){
        String[] arr =A.trim().split("\\s+");
        String return_String="";
        for(int i=arr.length-1;i>=0;i--){
            return_String += arr[i] + " ";
        }
          return  return_String;
    }
}
