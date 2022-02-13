package linkedlist;

public class ReverseALinkedList {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next = new ListNode(6);
        ListNode head = node;
        //Node out = reverseList(head);
        ListNode out = reverseListFromBtoC(head,2,4);
        int cnt =1;
        while(out !=null & cnt < 10){
            System.out.print(out.val + " ->");
            out = out.next;
            cnt++;
        }
    }
    public static ListNode reverseList(ListNode head){

        ListNode prev = null,next=null,curr= head;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static ListNode reverseListFromBtoC(ListNode A,int B, int C){
        ListNode prev = null,nxt=null,curr = A;
        System.out.println(B + " " + C);
        if(B==C)
            return A;
        int cnt = 1;
        ListNode nodeBeforeB = null,nodeAfterC=null,nodeAtB=null;
        while(curr != null) {
            prev = curr;
            if((B-cnt) == 1)
                nodeBeforeB=curr;
            if(B==cnt)
                nodeAtB=curr;
            if(cnt > C && nodeAfterC == null) {
                nodeAfterC = curr;
                System.out.println("C is : " + C + " " + cnt + " " + nodeAfterC.val);

            }
            curr = curr.next;
            cnt++;
        }
        if( B > 1)
          nodeBeforeB.next = null;
        prev = null;
        nxt = null;
        curr=nodeAtB;
        cnt=B;
        while(curr != null && cnt <= C){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
            cnt++;
        }
        if(B>1)
          nodeBeforeB.next = prev;
        nodeAtB.next=nodeAfterC;
        if(B> 1)
          return A;
        return prev;
    }
}
