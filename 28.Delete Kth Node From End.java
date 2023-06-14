//Coding Ninjas

public class Solution
{
    public static Node removeKthNode(Node head, int K)
    {
        Node slow=head;
        Node fast=head;
        while(K-->0){
            fast=fast.next;
        }
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        if(fast==null){
            slow=slow.next;
            return slow;
        }
        Node temp=slow.next;
        slow.next=slow.next.next;
        temp.next=null;
        return head;
    }
}
