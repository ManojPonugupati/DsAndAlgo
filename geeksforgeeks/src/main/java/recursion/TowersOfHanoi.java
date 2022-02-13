package recursion;
public class TowersOfHanoi {
    public static void main(String[] args) {

            toh(3,'A','B','C');
    }
     static void toh(int n,char from_rod,char to_rod,char aux_rod){
         if (n == 1)
         {
             System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod);
             return;
         }
         toh(n-1, from_rod, aux_rod, to_rod);
         System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod + " Yaar");
         toh(n-1, aux_rod, to_rod, from_rod);
     }
}
