package linkedlist;

public class palindrome {
    public static void main(String[] args) {
        ListNode A = new ListNode(1);
        ListNode B = new ListNode(2);
        ListNode C = new ListNode(3);
        ListNode D = new ListNode(2);
        ListNode E = new ListNode(1);
        A.next=B;
        B.next=C;
        C.next=D;
        D.next=E;
        System.out.println(checkPalindrom(A));
    }
    public static int checkPalindrom(ListNode head){
        ListNode x= head;
        ListNode sp=x,fp=x;
        while(fp.next !=null && fp.next.next !=null){
            sp=sp.next;
            fp=fp.next.next;
        }
        ListNode np =sp.next;
        sp.next=null;
        sp=x;
        np = reverseLinkedList(np);
        while(np !=null && sp !=null){
            if(np.val != sp.val)
                return 0;
            np=np.next;
            sp=sp.next;
        }
      return 1;
    }
    public static ListNode reverseLinkedList(ListNode head){
        ListNode current=head,next=null,previous=null;
        while(current !=null)
        {

            next = current.next;
            current.next=previous;
            previous = current;
            current=next;
        }
        return previous;
    }
}
