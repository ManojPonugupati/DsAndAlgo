package linkedlist;

public class DeepCopyOfLL {
    public static void main(String[] args) {
        RandomListNode one = new RandomListNode(1);
        RandomListNode two = new RandomListNode(2);
        RandomListNode three= new RandomListNode(3);
        RandomListNode four = new RandomListNode(4);
        one.next=two;
        two.next=three;
        three.next=four;
        one.random=three;
        two.random=one;
        three.random=one;
        four.random=three;
        RandomListNode head = getDeepCopy(one);
        System.out.println("Final data");
        printList(head);
    }

    public static RandomListNode getDeepCopy(RandomListNode head){

        if(head==null) return null;
         RandomListNode x = head;
         RandomListNode tmp_dummy = new RandomListNode(0);
         RandomListNode tmp=tmp_dummy;
         // Create a deep copy of nodes with out Random Node
         while(x != null){
             tmp.next = new RandomListNode(x.label);
             x=x.next;
             tmp=tmp.next;
         }
         x=head;
         tmp=tmp_dummy.next;
         RandomListNode x_nxt,tmp_nxt;
         // Mergethe orginial Node and deep copied Node
         while(x!=null){
             x_nxt=x.next;
             tmp_nxt=tmp.next;
             x.next=tmp;
             tmp.next=x_nxt;
             x=x_nxt;
             tmp = tmp_nxt;
         }
         x=head;
         // Assign the Random Node to deep copied Node
         while(x!= null){
             if(x.random != null)
             x.next.random = x.random.next;
             x=x.next.next;
         }
         // split the deep copy and original LL
        x=head;
        tmp_dummy=x.next;
        tmp=tmp_dummy;
        while(x.next.next != null){
           x=x.next.next;
           tmp.next=x.next;
           tmp = tmp.next;
        }
         return tmp_dummy;
    }

    public static void printList(RandomListNode head){
        RandomListNode x=head;
        while(x != null){
            System.out.print(x.label + " " + x.random.label + " -->");
            x=x.next;
        }
    }

}
