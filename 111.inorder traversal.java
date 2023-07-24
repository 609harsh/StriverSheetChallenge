public class Solution {
    static void inorder(TreeNode root,List<Integer> list){
        if(root==null)return;
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
    public static List < Integer > getInOrderTraversal(TreeNode root) {
    	// Write your code here.
        List<Integer> list=new ArrayList<>();
        inorder(root,list);
        return list;
    }
}
