package utils;

public class PairInt implements Comparable<PairInt>{
    public PairInt(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private int key;
    private int value;

    @Override
    public int compareTo(PairInt o) {
        if (key > o.key)
            return 1;
        else if (key < o.key)
            return -1;
        else if (key == o.key) {
            if (value > o.value)
                return 1;
            else return -1;
        }
        return 1;
    }
}
