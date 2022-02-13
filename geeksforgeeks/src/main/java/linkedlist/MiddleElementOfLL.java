package linkedlist;

public class MiddleElementOfLL {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(2);
        node.next.next.next.next = new ListNode(1);
        node.next.next.next.next.next = new ListNode(6);
        ListNode head= node;
        System.out.println(getMiddleElement(head));
    }
    public static int getMiddleElement(ListNode A){
        ListNode sp =A,fp=A;
        while(fp.next != null && fp.next.next !=null){
            fp=fp.next.next;
            sp=sp.next;
        }
        if(fp.next !=null)
            return sp.next.val;
        return sp.val;
    }
}
