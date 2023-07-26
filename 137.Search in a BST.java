public class Solution {
	static boolean search(BinaryTreeNode<Integer> root,int x){
		if(root==null)return false;
		if(root.data==x)return true;
		boolean v1=false,v2=false;
		if(root.data>x)v1=search(root.left,x);
		if(root.data<x)v2=search(root.right,x);
		return v1||v2;
	}
	public static Boolean searchInBST(BinaryTreeNode<Integer> root, int x) {
		// Write your code here.
		return search(root,x);
	}
}
