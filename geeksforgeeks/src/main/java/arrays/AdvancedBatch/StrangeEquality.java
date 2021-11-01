package arrays.AdvancedBatch;

public class StrangeEquality {
    public static void main(String[] args) {
        int A=16;
        int msb_pos=0;
        int computed_num=0;
        for(int i=0; (1<<i) <=A;i++)
        {
            if((A& (1<<i)) == 0)
                computed_num += (1<<i);
            else
                msb_pos=i;
        }
        System.out.println((1<<msb_pos+1) ^ computed_num);
    }
}
