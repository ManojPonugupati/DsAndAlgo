package linkedlist;

public class LongestPalindrome {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(2);
        node.next.next.next.next = new ListNode(1);
        node.next.next.next.next.next = new ListNode(6);
        ListNode head= node;
        System.out.println(getLongestPalindrome(head));
    }
    public static int getLongestPalindrome(ListNode head){
        return 1;
    }
}
