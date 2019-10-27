package linkedlist;

public class LinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> root;

    public void insert(T data) {
      if(root == null){
          this.root = new Node<T>(data);
      }else
      {
          Node<T> newNode = new Node<T>(data);
          newNode.setNextNode(root);
          this.root = newNode;
      }
    }

    public void traverseList(T data) {
       if(this.root == null) return;
       Node<T> actualNode = this.root;
       while(actualNode != null) {
           System.out.println();
           actualNode = actualNode.getNextNode();
       }
    }
}
