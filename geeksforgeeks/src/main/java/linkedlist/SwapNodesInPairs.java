package linkedlist;

public class SwapNodesInPairs {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
       // node.next.next.next.next.next = new ListNode(6);
        ListNode head= node;
        ListNode A =swapPairs(head);
        while(A != null){
            System.out.print(A.val + " ->");
            A =A.next;
        }
    }
    public static ListNode swapPairs(ListNode A){
        ListNode head =A;
        while(A !=null && A.next != null){
            int a = A.val;
            A.val = A.next.val;
            A.next.val=a;
            A=A.next.next;
        }
        return head;
    }
}
