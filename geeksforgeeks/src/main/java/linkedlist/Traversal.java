package linkedlist;


public class Traversal {

     public static void main(String[] args) {

         Node head = new Node(1);
         Node second = new Node(2);
         Node third = new Node(3);
         Node fourth = new Node(4);
         Node fifth = new Node(5);
         Node sixth = new Node(6);
         head.next=second;
         second.next =third;
         third.next=fourth;
         fourth.next=fifth;
         fifth.next=sixth;
         printList(head);
         System.out.println(nthElement(head,9));
         System.out.println("Before inserting element");
         head = insertHead(head,-1);
         System.out.println("after insertion");
         printList(head);
         System.out.println("before insetion of tail");
         insertTail(head,10);
         printList(head);
         System.out.println("Before deletion of nth element");
         head = deleteNthElemente(head,10);
         printList(head);
         System.out.println("Before reversion");
         head = reverseLinkedList(head);
         printList(head);

    }

    public static void printList(Node head){
         Node n = head;
         while(n != null){
             System.out.println(n.data);
             n=n.next;
         }
    }
    public static int nthElement(Node head, int k){
         Node  n = head;
         if(k==1) return n.data;
         for(int i=1;i<k;i++){
              if(n == null)
                  return 0;
              n=n.next;
         }
         return n.data;
    }
    public static Node insertHead(Node head, int data){
         Node x = head;
         Node starting = new Node(data);
         starting.next = head;
           head = starting;
           return head;
    }
    public static void insertTail(Node head, int data){
         Node x = head;
         Node end  = new Node(data);

         while(x.next != null){
             x= x.next;
         }
         x.next = end;
    }

    public static Node deleteNthElemente(Node head, int k){
         Node x = head;
         if(x== null) return null;

         if(x.data == k) {
             head = x.next;
             return head;
         }
         while(x.next != null){
             if(x.next.data == k){
                 x.next = x.next.next;
                 return head;
             }
             x = x.next;
         }
          return head;
     }
    public static Node reverseLinkedList(Node head){
         Node current=head,next=null,previous=null;
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
