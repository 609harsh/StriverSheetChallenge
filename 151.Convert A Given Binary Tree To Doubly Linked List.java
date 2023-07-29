public class Solution {
	static BinaryTreeNode<Integer> head;
	static BinaryTreeNode<Integer> prev;
	public static BinaryTreeNode<Integer> BTtoDLL(BinaryTreeNode<Integer> root) {
		//right is next pointer
		//left is prev pointer
		head = null;
		prev = null;
		f(root);
		return head;
	}
	static void f(BinaryTreeNode<Integer> root){
		if(root==null) return;
		f(root.left);
		if(prev==null) head = root;
		else {
			prev.right= root;
			root.left = prev;
		}
		prev = root;
        f(root.right);
	}
}
