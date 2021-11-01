package temp;

public class simpleTest {
    public static void main(String[] args) {
        int x=10;
        int[] y= {1,2,10,4,6};
        for(int i=0;i<y.length;i++){
            if(y[i]==x){
                System.out.println("index is : " + i);
                break;
            }
            System.out.println("test failed is : " + y[i]);
        }
    }
}
