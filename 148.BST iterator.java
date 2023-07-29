public class Solution {

    static class BSTIterator{
      ArrayList<Integer> yash=new ArrayList<>();
        int i;
        BSTIterator(TreeNode<Integer> root){
            helper(root);
        }
        void helper(TreeNode<Integer> root){
            if(root==null){
                return;
            }
            helper(root.left);
            yash.add(root.data);
            helper(root.right);
    
}
        int next(){
           return yash.get(i++);
            
            // Write your code here
        }

        boolean hasNext(){
          if(i<yash.size()){
              return true;
          }
            else{
               return false;
            }
           
        }
    }
}
