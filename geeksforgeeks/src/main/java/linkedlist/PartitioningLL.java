package linkedlist;

public class PartitioningLL {
    public static void main(String[] args) {
        //1, 4, 3, 2, 5, 2
        ListNode A = new ListNode(1);
        ListNode B = new ListNode(4);
        ListNode C = new ListNode(3);
        ListNode D = new ListNode(2);
        ListNode E = new ListNode(5);
        ListNode F = new ListNode(2);
        A.next = B;
        B.next = C;
        C.next = D;
        D.next = E;
        E.next = F;
        ListNode head = partitionIt(A,3);
        RemoveFromEnd.printList(head);
    }
    public static ListNode partitionIt(ListNode A,int B){
        ListNode x = A;
        if(x==null)
             return null;
        
        ListNode lb_head=new ListNode(0);
        ListNode gb_head= new ListNode(0);
        ListNode lb=lb_head;
        ListNode gb=gb_head;
        while(x !=null) {
            if (x.val < B) {
                lb.next = x;
                lb = lb.next;
            } else {

                gb.next = x;
                gb = gb.next;
            }
            x = x.next;
        }
         gb.next=null;
         lb.next=gb_head.next;
        return lb_head.next;
    }
}
