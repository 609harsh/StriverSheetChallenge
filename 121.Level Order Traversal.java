import java.util.ArrayList;

// import com.sun.tools.javac.code.Attribute.Array;

public class Solution {

  public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {
    //Your code goes here
	ArrayDeque<BinaryTreeNode> q=new ArrayDeque<>();
	ArrayList<Integer> list=new ArrayList<>();
	if(root==null)return list;
	q.push(root);
	while(q.size()!=0){
		BinaryTreeNode node=q.pollLast();
		list.add(node.val);
		if(node.left!=null)q.push(node.left);
		if(node.right!=null)q.push(node.right);
	}
	return list;
  }

}
