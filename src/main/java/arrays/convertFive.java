package arrays;

public class convertFive {
    public static void main(String[] args) {
      convertFive("abcd");
    }
   public static void convertFive(String n){
        char[] arr = n.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == '0'){
                arr[i] = '5';
            }
        }
        String str = new String(arr);
        try{
            System.out.println(Integer.parseInt(str));
        } catch (NumberFormatException e){



        }


       /*System.out.println(Integer.parseInt(str));*/
    }
}
