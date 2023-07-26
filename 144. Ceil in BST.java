public class Solution {
    
    static int f(TreeNode<Integer> root,int x){
        if(root==null)return -1;
        if(root.data==x)return x;
        if(root.data<x)return f(root.right,x);
        int ceil=f(root.left,x);
        return ceil>=x?ceil:root.data;
    }

    public  static int findCeil(TreeNode<Integer> node, int x) {

        // Write your code here
        return f(node,x);
    }
}
