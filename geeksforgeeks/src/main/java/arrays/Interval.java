package arrays;

public class Interval {
    int start;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
