package arrays;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        //(1, 10), (2, 9), (3, 8), (4, 7), (5, 6), (6, 6)

        Interval I1 = new Interval (1, 3);
        Interval I2 = new Interval (2,6);
        Interval I3 = new Interval (8,10);
        Interval I4 = new Interval (15, 18);
        Interval I5 = new Interval (19, 27);
        Interval I6 = new Interval (24, 29);

/*
        Interval I1 = new Interval (54, 75);
        Interval I2 = new Interval (56, 60);
        Interval I3 = new Interval (61, 86);
        Interval I4 = new Interval (22, 43);
        Interval I5 = new Interval (56, 87);
        Interval I6 = new Interval (32, 53);
        Interval I7= new Interval  (14, 81);
        Interval I8 = new Interval (64, 65);
        Interval I9 = new Interval (9, 42);
        Interval I10 = new Interval(12, 33);
        Interval I11 = new Interval(22, 58);
        Interval I12 = new Interval(84, 90);
        Interval I13 = new Interval (27, 59);
        Interval I14 = new Interval(41, 48);
        Interval I15 = new Interval(43, 47);
        Interval I16 = new Interval(22, 29);
        Interval I17 = new Interval(16, 23);
        Interval I18 = new Interval(41, 72);
        Interval I19 = new Interval(15, 87);
        Interval I20 = new Interval(20, 59);
        Interval I21 = new Interval(45, 84);
        Interval I22 = new Interval(14, 77);
        Interval I23 = new Interval(72, 93);
        Interval I24 = new Interval(20, 58);
        Interval I25 = new Interval(47, 53);
        Interval I26 = new Interval(25, 88);
        Interval I27 = new Interval(5, 89);
        Interval I28 = new Interval(34, 97);
        Interval I29 = new Interval(14, 47);
*/

        // Interval I1 = new Interval();
        //Interval i5 = new Interval(5,6);
        //Interval i6 = new Interval(6,6);
        ArrayList<Interval> intv = new ArrayList<>();
        intv.add(I1);
        intv.add(I2);
        intv.add(I3);
        intv.add(I4);
        intv.add(I5);
        intv.add(I6);
/*
        intv.add(I7);
        intv.add(I8);
        intv.add(I9);
        intv.add(I10);
        intv.add(I11);
        intv.add(I12);
        intv.add(I13);
        intv.add(I14);
        intv.add(I15);
        intv.add(I16);
        intv.add(I17);
        intv.add(I18);
        intv.add(I19);
        intv.add(I20);
        intv.add(I21);
        intv.add(I22);
        intv.add(I23);
        intv.add(I24);
        intv.add(I25);
        intv.add(I26);
        intv.add(I27);
        intv.add(I28);
        intv.add(I29);
*/
        //intv.add(i5);
        //intv.add(i6);
        System.out.println("before end");
        for(Interval interval: solve(intv)){
            System.out.println(interval.start + " " + interval.end);
        }
    }
    public static ArrayList<Interval> solve(ArrayList<Interval> intervals){
        ArrayList<Interval> out_list= new ArrayList<>();
        Collections.sort(
                intervals,new Comparator<Interval>(){
                    public int compare(Interval i1,Interval i2){
                        return  i1.start - i2.start;
                    }

                }
                    );
        int index=0;
         out_list.add(new Interval(intervals.get(index).start,intervals.get(index).end));
        for(int i=1;i<intervals.size();i++) {
         if(intervals.get(i).start < out_list.get(index).end)
         {
             out_list.set(index, new Interval(out_list.get(index).start, findMax(out_list.get(index).end, intervals.get(i).end)));

         } else {
             out_list.add(new Interval(intervals.get(i).start, intervals.get(i).end));
             index++;
         }
        }
        return out_list;
    }
    static int findMax(int a, int b){
        if(a>b)
            return a;
        return b;
    }
}
