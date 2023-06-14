//Coding Ninjas

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
        if(first==null)return second;
        if(second==null)return first;
		LinkedListNode<Integer> ptr1=first;
        LinkedListNode<Integer> ptr2=second;
        if(ptr1.data>ptr2.data){
            LinkedListNode<Integer> temp=ptr1;
            ptr1=ptr2;
            ptr2=temp;
        }
        LinkedListNode<Integer> head=ptr1;
        LinkedListNode<Integer> prev1=ptr1;
        LinkedListNode<Integer> prev2=ptr2;
        while(ptr1!=null && ptr2!=null){
            if(ptr1.data<=ptr2.data){
                prev1=ptr1;
                ptr1=ptr1.next;
            }
            else {
                prev2=prev2.next;
                ptr2.next=null;
                ptr2.next=ptr1;
                prev1.next=ptr2;
                ptr2=prev2;
                prev1=prev1.next;
            }
        }
        if(ptr2!=null){
            prev1.next=ptr2;
        }
        return head;
	}
}
