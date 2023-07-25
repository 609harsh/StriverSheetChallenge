import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T> 
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) 
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

import java.util.ArrayList;

public class Solution 
{
     static ArrayList<Integer> list;
   public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) 
    {
        
        list=new ArrayList<Integer>();
        recursion(root,0);
        return list;
    }
    static void recursion (TreeNode<Integer> root,int size){
        if(root==null)return;
        if(list.size()==size)
        list.add(root.data);
        
        recursion(root.left,size+1);
        recursion(root.right,size+1);
    }
}
