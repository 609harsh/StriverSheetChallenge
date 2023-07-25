public class Solution {
	static void preorder(BinaryTreeNode<Integer> root,List<Integer> list){
		if(root==null)return ;
		list.add(root.data);
		preorder(root.left,list);
		preorder(root.right,list);
	}
	static void postorder(BinaryTreeNode<Integer> root,List<Integer> list){
		if(root==null)return ;
		postorder(root.left,list);
		postorder(root.right,list);
		list.add(root.data);
	}
	static void inorder(BinaryTreeNode<Integer> root,List<Integer> list){
		if(root==null)return ;
		inorder(root.left,list);
		list.add(root.data);
		inorder(root.right,list);
	}
    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        // Write your code here.
		List<List<Integer>> list=new ArrayList<>();
		List<Integer> pre =new ArrayList<>();
		List<Integer> post =new ArrayList<>();
		List<Integer> in =new ArrayList<>();
		preorder(root,pre);
		postorder(root,post);
		inorder(root,in);

		list.add(in);
		list.add(pre);
		list.add(post);
		return list;
    }
}
