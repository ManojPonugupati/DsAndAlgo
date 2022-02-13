package linkedlist;

public class DeleteDupsInSortedList {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(1);
        node.next.next = new ListNode(1);
        node.next.next.next = new ListNode(2);
        node.next.next.next.next = new ListNode(2);
        node.next.next.next.next.next = new ListNode(2);
        ListNode head= node;
        removeDupsInLL(head);
        ListNode current = node;
        while(current !=null){
            System.out.print(current.val + "->");
            current=current.next;
        }
    }
    public static void removeDupsInLL(ListNode A){
        ListNode cur = A;
        while(cur != null && cur.next != null){
            while(cur != null && cur.next != null &&
                    cur.val == cur.next.val)
                cur.next = cur.next.next;
            cur = cur.next;
        }
    }
}
