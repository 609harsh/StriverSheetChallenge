public class Solution {
    public static boolean validateBST(BinaryTreeNode<Integer> root) {
        // Write your code here
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)<arr.get(i-1))return false;
        }
        return true;
    }
    static void inorder(BinaryTreeNode<Integer> root,ArrayList<Integer> list){
        if(root==null)return ;
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }


}
