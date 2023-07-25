public class Solution {
	static class Pair{
		TreeNode node;
		int level;
		Pair(TreeNode root,int val){
			this.node=root;
			this.level=val;
		}
	}
	public static int getMaxWidth(TreeNode root) {
		Queue<Pair> q=new LinkedList<>();
		Map<Integer,Integer> map=new HashMap<>();
		if(root==null)return 0;
		q.offer(new Pair(root,0));
		while(q.size()!=0){
			Pair p=q.poll();
			TreeNode node=p.node;
			int level=p.level;
			map.put(level,map.getOrDefault(level,0)+1);
			if(node.left!=null)q.offer(new Pair(node.left,level+1));
			if(node.right!=null)q.offer(new Pair(node.right,level+1));
		}
		int max=0;
		for(int i:map.keySet()){
			if(map.get(i)>max)max=map.get(i);
		}
		return max;
	}
}
