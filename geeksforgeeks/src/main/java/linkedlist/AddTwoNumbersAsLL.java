package linkedlist;

public class AddTwoNumbersAsLL {
    public static void main(String[] args) {
        int A = 243;
        int B = 564;
        int a_dash=0,b_dash=0,out=0;
        while(A > 0){
            a_dash = a_dash * 10 + A%10;
            A=A/10;
        }
        while(B > 0){
            b_dash = b_dash * 10 + B%10;
            B=B/10;
        }
        out = a_dash + b_dash;
        ListNode head = new ListNode(out%10);
        ListNode X= head;
        out = out/10;
        while(out > 0){
            ListNode nxt = new ListNode(out%10);
            out = out/10;
            X.next = nxt;
            X=nxt;
        }
        while(head != null){
            System.out.print(head.val + " ->");
            head = head.next;
        }
    }
}
