public class Solution 
{
	public static TreeNode<Integer> LCAinaBST(TreeNode<Integer> root, TreeNode<Integer> p, TreeNode<Integer> q) 
    {		
        // Write your code here
        if(root==null) return root;
        if(root.data>p.data&&root.data>q.data) return LCAinaBST(root.left,p,q);
        if(root.data<p.data&&root.data<q.data) return LCAinaBST(root.right,p,q);
        return root;
	}
}
