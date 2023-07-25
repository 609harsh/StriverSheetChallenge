public class Solution {
    static ArrayList<Integer> list;
    static void preorder(TreeNode root,int x,ArrayList<Integer> ans){
        if(root==null)return ;
        if(root.data==x){
            ans.add(x);
            list=new ArrayList<Integer>(ans);
            ans.remove(ans.size()-1);
            return ;
        }
        
        ans.add(root.data);
        preorder(root.left,x,ans);
        preorder(root.right,x,ans);
        ans.remove(ans.size()-1);
    }
    public static ArrayList<Integer> pathInATree(TreeNode root, int x) {
        // Write your code here..
        ArrayList<Integer> ans=new ArrayList<>();
        preorder(root,x,ans);
        return list;
    }
}
