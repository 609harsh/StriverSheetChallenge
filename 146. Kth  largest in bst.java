public class Solution 
{
	static void inorder(TreeNode<Integer> root,ArrayList<Integer>list){
		if(root==null)return;
		inorder(root.left,list);
		list.add(root.data);
		inorder(root.right,list);

	}

	public static int kthSmallest(TreeNode<Integer> root, int k) 
	{
		//  Write your code here.
		ArrayList<Integer> list=new ArrayList<>();
		inorder(root,list);
		
		return list.get(k-1);
	}


}
