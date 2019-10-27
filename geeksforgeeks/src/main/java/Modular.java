public class Modular
{
    public static void main(String[] args) {
        System.out.println(modInverse(3,11));
    }
    public static int modInverse(int a, int m)
    {
        //Your code here
        int test=0;
        for(int i=1;i<m;i++){
            test=i;
            if(i*a%m == 1){
                break;
            }
        }
        return test;
    }
}
