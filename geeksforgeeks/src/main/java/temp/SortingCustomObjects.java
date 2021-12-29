package temp;

import java.util.Arrays;

public class SortingCustomObjects {
    public static void main(String[] args) {
        Player[] p = new Player[5];
        p[0]=new Player(1, "Dravid", 88.55, 2);
        p[1]=new Player(2, "Sehwag", 55.65, 5);
        p[2]=new Player(3, "Laxman", 77.75, 3);
        p[3]=new Player(4, "Sachin", 99.25, 1);
        p[4]=new Player(5, "Sourav", 66.15, 4);
        System.out.println("Before");
        for(int i=0;i<5;i++){
            System.out.println(p[i].getId() + " " + p[i].getName()
                    + " " + p[i].getAverage() + " " + p[i].getRank());
        }
        Player[] out = Arrays.stream(p).sorted((a, b)->b.getId()-a.getId()).toArray(Player[]::new);
        System.out.println("---------------");
        for(int i=0;i<5;i++){
            System.out.println(out[i].getId() + " " + out[i].getName()
            + " " + out[i].getAverage() + " " + out[i].getRank());
        }
    }
}
