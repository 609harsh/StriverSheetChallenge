public class Solution {
	static int max;
	static int traversal(TreeNode<Integer> root){
		if(root==null)return 0;
		int e1=0,e2=0;
		
		e1=traversal(root.left);
		
		e2=traversal(root.right);
		max=Math.max(max,e1+e2);
		return Math.max(e1,e2)+1;

	}
	public static int diameterOfBinaryTree(TreeNode<Integer> root) {
		// Write your code here.
		max=0;
		int res=traversal(root);
		return max;
	}
}
