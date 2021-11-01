package linkedlist;


public class RemoveFromEnd {
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);
       // ListNode seven= new ListNode(7);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
       // six.next = seven;
        ListNode head = one;
        //head = removeFromEnd(head, 2);
        //head =kOrderReverseList(head,2);
        head = reOrderList(head);
    }
    public static ListNode removeFromEnd(ListNode head, int n){
        ListNode x = head;
        int len=1;
        while(x.next != null){
            len++;
            x=x.next;
        }
        x=head;
        if(n >= len || len - n == 1){
            head = x.next;
            return head;
        }

        int i=1;
        while(x.next !=null){
            if(i== (len - n)){
                x.next= x.next.next;
                return head;
            }
            i++;
            x=x.next;
        }
        return head;
    }

    public static ListNode kOrderReverseList(ListNode A,int B){
        ListNode current=A,next=null,prev=null,head=current;
        int i=1;
        if(B==1 || B == 0) return A;
        while(current != null && i<=B){
            next =current.next;
            current.next=prev;
            prev=current;
            current=next;
            i++;
        }

        if(next != null){
            head.next =kOrderReverseList(next,B);
        }
        return prev;
    }
    public static ListNode reOrderList(ListNode A){
        ListNode slowPointer=A,fastPointer=A;
        while( !(fastPointer.next ==null || fastPointer.next.next ==null)){
            slowPointer = slowPointer.next;
            fastPointer=fastPointer.next.next;
        }
        ListNode mid = slowPointer.next;
        slowPointer.next=null;
        ListNode secondHead =reverseLinkedList(mid);
        ListNode p1 = A;
        ListNode p2 = secondHead;
        ListNode t1,t2;
        while(p1 != null && p2 !=null){
            t1=p1.next;
            t2=p2.next;
            p1.next = p2;
            p2.next = t1;
            p1=t1;
            p2=t2;
        }
        return A;
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
    public static void printList(ListNode head){
        ListNode n = head;
        while(n != null){
            System.out.println(n.val);
            n=n.next;
        }
    }
}
