public class Solution {
	static void preorder(TreeNode root,List<Integer> list){
        if(root==null)return;
		list.add(root.data);
        preorder(root.left,list);
        
        preorder(root.right,list);
    }
    public static List < Integer > getPreOrderTraversal(TreeNode root) {
    	// Write your code here.
		List<Integer> list=new ArrayList<>();
        preorder(root,list);
        return list;
    }
}
