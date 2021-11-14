package corejava;

public class StudentCls implements Comparable<StudentCls> {
    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
   int rollno;
   String name;
   int age;
   StudentCls(int rollno, String name, int age){
       this.rollno=rollno;
       this.name=name;
       this.age=age;
   }
    @Override
    public int compareTo(StudentCls o) {
        if(age==o.age)
         return 0;
        else if(age > o.age)
            return 1;
        else return -1;
    }
}

