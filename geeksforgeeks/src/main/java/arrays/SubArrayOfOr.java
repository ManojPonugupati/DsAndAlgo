package arrays;

public class SubArrayOfOr {
    public static void main(String[] args) {
        //int[] A ={1,2,3,4,5};
        int[]A={28189, 77911, 598231, 298338, 137953, 77258, 271663, 218021, 49069, 11276, 55056, 465305, 799261, 213889, 593476, 50233, 243457, 119757, 323318, 26821, 255113, 6976, 392341, 329077, 83917, 372513, 30169, 111111, 16966, 235231, 50276, 154883, 148501, 101309, 32830, 55233, 58097, 179983, 19903, 12769, 53953, 71622, 36253, 1, 123445, 207751, 321105, 11029, 297088, 7123, 440373, 299547, 164281, 13847, 290440, 20203, 20953, 214, 440146, 9569, 451606, 547723, 130637, 237171, 380275, 79689, 383088, 79036, 328154, 272601, 444745, 105656, 429826, 91171, 111457, 160229, 60351, 401017, 785201, 333592, 25186, 58981, 57525, 626165, 486585, 105, 237391, 31350, 145153, 561601, 133836, 79255, 94612, 227636, 56101, 427805, 129901, 42238, 6881, 35985};
        System.out.println(subArrayOfOr(A) + " " + A.length);
    }
    public static int subArrayOfOr(int[] A){
        long out_sum=0;
        long non_set_bits=0;
        long non_set_bits_sum=0;
        long total_bits =0;
        for(int i=0;i<32;i++){
            int set_bit = (1<<i);
            for(int j=0;j<A.length;j++){
                if((A[j] & set_bit) == 0) {
                    non_set_bits++;
                    non_set_bits = non_set_bits%1000000007;
                }
                else {
                    non_set_bits_sum += ((non_set_bits) * ((non_set_bits + 1)) / 2)%1000000007;
                    non_set_bits_sum = non_set_bits_sum%1000000007;
                    non_set_bits=0;
                }

                total_bits++;
                total_bits = total_bits%1000000007;
            }
            non_set_bits_sum += ((non_set_bits) * ((non_set_bits + 1) )/ 2)%1000000007;
            non_set_bits_sum = non_set_bits_sum%1000000007;

            out_sum += ((Math.pow(2,i))%1000000007 * (((total_bits)*((total_bits+1))/2)%1000000007 - non_set_bits_sum%1000000007))%1000000007;
            total_bits=0;
            non_set_bits=0;
            non_set_bits_sum=0;
        }
        return (int) (out_sum%1000000007);
    }
}
