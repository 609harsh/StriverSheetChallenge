//Coding Ninjas

public class Solution {
	public static LinkedListNode<Integer> cloneRandomList(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> node=new LinkedListNode<Integer>(0);
		LinkedListNode<Integer> temp=node;
		while(head!=null){
			LinkedListNode<Integer> temp2=new LinkedListNode<Integer>(head.data);
			temp2.next=head.next;
			temp2.random=head.random;
			temp.next=temp2;
			temp=temp.next;
			head=head.next;
		}
		return node.next;
	}
}
