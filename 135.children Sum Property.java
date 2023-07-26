import java.util.* ;
import java.io.*; 
/*************************************************************

    Following is the Binary Tree node structure
    class BinaryTreeNode < Integer > {
        int data;
        BinaryTreeNode < Integer > left;
        BinaryTreeNode < Integer > right;

    public BinaryTreeNode(int data) {
            this.data = data;
        }
    }

*************************************************************/

public class Solution {
    static void sumTree(BinaryTreeNode<Integer> root){
        if(root==null)return ;
        if(root.left!=null && root.right!=null){
            int left=root.left.data;
            int right=root.right.data;
            int rootVal=root.data;
            if(rootVal>(left+right)){
                root.left.data=root.data;
                root.right.data=root.data;
            }
        }
        else if(root.left!=null){
            int left=root.left.data;
            int rootVal=root.data;
            if(rootVal>left)root.left.data=rootVal;
            
        }
        else if(root.right!=null){
            int right=root.right.data;
            int rootVal=root.data;
            if(rootVal>right)root.right.data=rootVal;
        }

        sumTree(root.left);
        sumTree(root.right);

        if(root.left!=null && root.right!=null){
            int left=root.left.data;
            int right=root.right.data;
            int rootVal=root.data;
            if(rootVal<(left+right))root.data=left+right;
        }
        else if(root.left!=null){
            int left=root.left.data;
            int rootVal=root.data;
            if(rootVal<left)rootVal=left;
            root.data=rootVal;
        }
        else if(root.right!=null){
            int right=root.right.data;
            int rootVal=root.data;
            if(rootVal<right)rootVal=right;
            root.data=rootVal;
        }

    }
    public static void changeTree(BinaryTreeNode < Integer > root) {
        // Write your code here.
        sumTree(root);
    }
}
