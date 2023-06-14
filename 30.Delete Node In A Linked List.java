//Coding Ninjas

public class Solution {
	public static void deleteNode(LinkedListNode<Integer> node) {
		// Write your code here.
        if(node==null)return ;
        LinkedListNode<Integer> prev=node;
        while(node!=null && node.next!=null){
            node.data=node.next.data;
            prev=node;
            node=node.next;
        }
        prev.next=null;
        return ;
	}
}
