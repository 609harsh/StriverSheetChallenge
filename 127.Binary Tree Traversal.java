
public class Solution {
	public static List<Integer> zigZagTraversal(BinaryTreeNode<Integer> root) {
		// Write your code here!
		ArrayDeque<BinaryTreeNode<Integer>> q=new ArrayDeque<>();
        List<Integer> list=new ArrayList<>();
        if(root==null)return list;
        q.add(root);
        int zigzag=0;
        while(q.size()!=0){
            
            int size=q.size();
            
            if(zigzag==0){
                while(size-->0){
                    BinaryTreeNode<Integer> node=q.poll();
                    if(node.left!=null)q.offer(node.left);
                    if(node.right!=null)q.offer(node.right);
                    list.add(node.data);
                }
            }
            else{
                ArrayList<BinaryTreeNode<Integer>> list2=new ArrayList<>();
                while(q.size()!=0){
                    list2.add(q.pollLast());
                }
                for(int i=0;i<size;i++){
                    BinaryTreeNode<Integer> node=list2.get(i);
                    if(node.right!=null)q.offerFirst(node.right);
                    if(node.left!=null)q.offerFirst(node.left);
                    list.add(node.data);
                }
            }
            zigzag=zigzag==1?0:1;
            
        }
        return list;

	}
}
