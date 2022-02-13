package linkedlist;

public class ReOrderList {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        node.next.next.next.next.next = new Node(6);
        Node head = node;
        Node sp = head;
        Node fp = head;
        while(fp.next !=null && fp.next.next !=null){
            fp=fp.next.next;
            sp=sp.next;
        }
        System.out.println(sp.data);
        Node newHead=null;
        newHead = sp.next;
        Node curr = newHead,prev = null,next=null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        newHead = prev;
        curr = prev;
        sp=head;
        while(curr.next != null){
            Node t1= sp.next;
            Node p1 = curr.next;
            sp.next= curr;
            curr.next = t1;
            sp=t1;
            curr = p1;
        }
        sp=head;
        int cnt=0;
        while(sp !=null && cnt < 20){
            System.out.print(sp.data + " ->");
            sp=sp.next;
            cnt++;
        }
    }
}
