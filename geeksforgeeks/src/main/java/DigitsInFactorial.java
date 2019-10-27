
public class DigitsInFactorial {
    static int count2 =0;
    static String data1 = "4567";
    static String data2 ="243";
    public static void main(String[] args) {
        digitsInFactorialWithOutRec(data1,data2);
    }

    /*
          4567 *
           243 =
        1|---------------|
                13701
               18268
               9134
               --------
                1109781
     */
    public static void digitsInFactorialWithOutRec(String digit1,String digit2){
     char[] arr1 = digit1.toCharArray();
     char[] arr2 = digit2.toCharArray();
     int len1 = arr1.length;
     int len2 = arr2.length;
     int [] arrx = new int[len1];
     int [] arry = new int[len2];
     int cnt =0;
     for(int i = len1-1;i>= 0 ; i--) {
         System.out.println(arr1[i]);
       arrx[cnt] = arr1[i];
       cnt++;
     }
     cnt=0;
     for(int i=len2-1;i>=0;i--){
         arry[cnt]=arr2[i];
         cnt++;
     }
     int actual =0;
     int mul=0;
     int carry =0;
     int size=0;
     int[] arr  = new int[len1+len2];
     int x=len2-1;

     for(int i=0;i < len2;i++){
         for(int j = 0; j <len1;j++){
             mul =  Character.getNumericValue(arrx[j]) * Character.getNumericValue(arry[i]) + carry;
             carry = mul/10;
             actual = mul%10;
             arr[size] = actual;
             size++;
         }

     }
     for(int num:arr){
         System.out.print(num);
     }

     }

     }

