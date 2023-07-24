public class Solution {
    static void postorder(TreeNode root,List<Integer> list){
        if(root==null)return;
        postorder(root.left,list);
        postorder(root.right,list);
        list.add(root.data);
    }
    public static List < Integer > getPostOrderTraversal(TreeNode root) {
    	// Write your code here.
        List<Integer> list=new ArrayList<>();
        postorder(root,list);
        return list;
    }
}
