package linkedlist;

public class Node<T extends Comparable<T>> {

    @Override
    public String toString() {
        return this.data.toString();
    }

    private T data;
    private Node<T> nextNode;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public Node(T data) {
        this.data = data;
    }
}
