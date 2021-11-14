package corejava;

import java.util.Comparator;

public class ComparatorCls implements Comparator<StudentCls> {
    @Override
    public int compare(StudentCls o1, StudentCls o2) {
        if(o1.rollno == o2.rollno)
            return 0;
        else if(o1.rollno > o2.rollno)
            return 1;
        else return -1;
    }
}
