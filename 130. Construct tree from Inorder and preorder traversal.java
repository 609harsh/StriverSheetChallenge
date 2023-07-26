import java.util.ArrayList;

public class Solution 
{
    static int idx;
    public static TreeNode<Integer> buildBinaryTree(ArrayList<Integer>  ino, ArrayList<Integer>  pre) 
    {
        //    Write your code here.
        int []inorder=new int[ino.size()];
        int []preorder=new int[pre.size()];
        for(int i=0;i<inorder.length;i++){
            inorder[i]=ino.get(i);
            preorder[i]=pre.get(i);
        }
        
        idx=0;
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<inorder.length;i++){
        map.put(inorder[i],i);
      }
      TreeNode<Integer> root=buildTree(inorder,preorder,map,0,inorder.length-1);
      return root;
    }
    static TreeNode<Integer> buildTree(int[] in,int[] pre,HashMap<Integer,Integer> map,int s,int e)
    {
      if(s>e)return null;
      int rootVal=pre[idx++];
      TreeNode<Integer> root=new TreeNode<Integer>(rootVal);
      
      root.left=buildTree(in,pre,map,s,map.get(rootVal)-1);
      root.right=buildTree(in,pre,map,map.get(rootVal)+1,e);
      return root;
    }
    
}
