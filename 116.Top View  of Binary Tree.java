import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure:

    class BinaryTreeNode {
		int val;
		BinaryTreeNode left;
		BinaryTreeNode right;

		BinaryTreeNode(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

************************************************************/

// public class Solution {
// 	public static ArrayList<Integer> getTopView(BinaryTreeNode root) {
// 		// Write your code here.
// 	}
// }

public class Solution {
    static class Pair {
        BinaryTreeNode root;
        int val;
        Pair(BinaryTreeNode root,int val){
            this.root=root;
            this.val=val;
        }
    }

    public static ArrayList<Integer> getTopView(BinaryTreeNode root) {
        // Write your code here.  
        ArrayList<Integer> list=new ArrayList<>();
        Queue<Pair> q=new LinkedList<>();
        Map<Integer,Integer> map=new TreeMap<>();
        if(root==null)return list;
        q.offer(new Pair(root,0));
        // map.put(0,root.val);

        while(q.size()!=0){
            Pair p=q.poll();
            BinaryTreeNode node=p.root;
			if(!map.containsKey(p.val))
            map.put(p.val,node.val);
            if(node.left!=null)q.offer(new Pair(node.left,p.val-1));
            if(node.right!=null)q.offer(new Pair(node.right,p.val+1));
        }
        for(int i:map.keySet())list.add(map.get(i));
        return list;
    }
}
