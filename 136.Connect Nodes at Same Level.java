
public class Solution {
	static class Pair{
		BinaryTreeNode<Integer> node;
		int level;
		Pair(BinaryTreeNode<Integer> root,int val){
			this.node=root;
			this.level=val;
		}
	}
	public static void connectNodes(BinaryTreeNode<Integer> root) {
    	// Write your code here.
		LinkedList<Pair> q=new LinkedList<>();
		q.add(new Pair(root,0));
		while(!q.isEmpty()){
			Pair p=q.poll();
			BinaryTreeNode<Integer> node=p.node;
			int le=p.level;
			if(!q.isEmpty() && q.peek().level==le){
				node.next=q.peek().node;
			}
			if(node.left!=null)q.offer(new Pair(node.left,le+1));
			if(node.right!=null)q.offer(new Pair(node.right,le+1));
		}	
	}
}
