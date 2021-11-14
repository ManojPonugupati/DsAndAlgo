package corejava;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {

    public static void main(String[] args) {
        ArrayList<StudentCls> al = new ArrayList<>();
        al.add(new StudentCls(100,"firstentry",27));
        al.add(new StudentCls(101,"secentry",23));
        al.add(new StudentCls(99,"thirdentry",21));
        al.add(new StudentCls(98,"4thentry",23));
        Collections.sort(al);
       for(StudentCls st : al){
           System.out.println(st.rollno + " " + st.name + " " + st.age);
       }
       Collections.sort(al,new ComparatorCls());
        System.out.println("after sorting it on ");
        for(StudentCls st : al){
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
        System.out.println("using java 8 comparison");

    }
}
