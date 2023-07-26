public class Solution {
    static int f(TreeNode<Integer> root,int x){
        if(root==null)return -1;
        if(root.data==x)return x;
        if(root.data>x) return f(root.left,x);
        int floor=f(root.right,x);;
        return floor<=x && floor!=-1?floor:root.data;
    }

    public static int floorInBST(TreeNode<Integer> root, int X) {
        //    Write your code here.
        return f(root,X);
    }
}
