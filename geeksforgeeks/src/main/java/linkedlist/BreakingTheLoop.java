package linkedlist;

import java.util.HashMap;

public class BreakingTheLoop {
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        five.next=six;
        six.next=four;
        ListNode head = breakTheLoop(one);
        RemoveFromEnd.printList(head);
    }

    public static ListNode breakTheLoop(ListNode head){
        ListNode x = head;
        HashMap<ListNode,Integer> hm = new HashMap<>();
        if(x==null)
             return null;
        while(x !=null){
            if(hm.get(x.next)==null){
                hm.put(x,1);
            } else
            {
                x.next=null;
                return head;
            }
            x=x.next;
        }
        return head;
    }
}
