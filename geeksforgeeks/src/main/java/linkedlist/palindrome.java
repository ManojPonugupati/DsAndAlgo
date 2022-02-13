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
        ListNode x = new ListNode(1);
        x.next = new ListNode(2);
        x.next.next = new ListNode(2);
        x.next.next.next = new ListNode(1);

        System.out.println(checkPalindrom(x));
        System.out.println(checkPalindromicSubStringWithNoExtraSpace(A));
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

    public static int checkPalindromicSubStringWithNoExtraSpace(ListNode head){
        ListNode curr = head,prev=null,nxt = null;
        int max = -1;
        int even=0,odd=0;
        while(curr !=null){
            nxt=curr.next;
            curr.next=prev;
            odd = 2 * getMatchingCount(prev,nxt) + 1;
            even= 2 * getMatchingCount(curr,nxt);
            int localMax = Math.max(even,odd);
            max = Math.max(max,localMax);
            prev=curr;
            curr=nxt;
        }
        return max;
    }
    public static int getMatchingCount(ListNode node1,ListNode node2){
        int cnt =0;
        for(;node1 !=null && node2 != null; node1=node1.next,node2=node2.next){
            if(node1.val == node2.val){
                cnt++;
            }else {
                break;
            }
        }
        return cnt;
    }
}
