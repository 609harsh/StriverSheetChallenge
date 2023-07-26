public class Solution {

	public static boolean isBalancedBT(BinaryTreeNode<Integer> root) {
		// Write your code here.
        return balanced(root)>0?true:false;
	}
    static int balanced(BinaryTreeNode<Integer> root){
        if(root==null)return 0;
        int lh=balanced(root.left);
        if(lh==-1)return -1;
        int rh=balanced(root.right);
        if(rh==-1)return -1;

        if(Math.abs(lh-rh)>1)return -1;
        else return Math.max(lh,rh)+1;
    }
}
