package trees;

public interface Tree<T> {
    public void traverse();

    public void insert();

    public void delete();

    public T getMax();

    public T getMin();
}
