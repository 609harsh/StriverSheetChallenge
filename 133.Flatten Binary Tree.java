public class Solution 
{
	static TreeNode<Integer> prev;
	static void flatten(TreeNode<Integer> root){
		if(root==null)return;
		flatten(root.right);
		flatten(root.left);
		root.right=prev;
		root.left=null;
		prev=root;
	}
    public static TreeNode<Integer> flattenBinaryTree(TreeNode<Integer> root)
    {
		prev=null;
		TreeNode<Integer> temp=root;
        flatten(root);
		return temp;

    }
}
