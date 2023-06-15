//Coding Ninjas
public class Solution {
    public static Node rotate(Node head, int k) {
        int count=0;
        Node temp2=head;
        while(temp2!=null){
            count++;
            temp2=temp2.next;
        }
        k=k%count;
        if(k==0)return head;
        Node slow=head;
        Node fast=head;
        Node temp=head;
        while(k-->0){
            fast=fast.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        fast.next=temp;
        Node ptr=slow.next;
        slow.next=null;
        return ptr;
    }
}
